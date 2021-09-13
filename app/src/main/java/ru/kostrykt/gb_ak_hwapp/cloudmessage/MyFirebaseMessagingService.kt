package ru.kostrykt.gb_ak_hwapp.cloudmessage

import android.app.NotificationManager
import android.content.Context
import android.util.Log
import androidx.core.app.NotificationCompat
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import ru.kostrykt.gb_ak_hwapp.R

const val CHANNEL_ID = "CHANNEL_MAIN"

class MyFirebaseMessagingService : FirebaseMessagingService() {

    private var notificationId = 10

    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        val title = remoteMessage.notification?.title ?: "Title"
        val body = remoteMessage.notification?.body ?: "Body"
        showNotification(title, body)
    }

    private fun showNotification(title: String, message: String) {
        val notificationBuilder = NotificationCompat.Builder(applicationContext, CHANNEL_ID).apply {
            setSmallIcon(R.drawable.ic_kotlin_logo)
            setContentTitle(title)
            setContentText(message)
            priority = NotificationCompat.PRIORITY_DEFAULT
        }

        val notificationManager =
            getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        notificationId++
        notificationManager.notify(notificationId, notificationBuilder.build())
    }

    override fun onNewToken(token: String) {
        Log.d("FIREBASEMSG", token)
    }
}