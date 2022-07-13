package ru.smartsport.domain

import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.gson.Gson
import ru.smartsport.R
import android.content.Context
import com.google.firebase.messaging.RemoteMessage
import android.util.Log

class FCMService : FirebaseMessagingService() {
    private val channelId = "remote"
    private val gson = Gson()

//    override fun onCreate() {
//        super.onCreate()
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
//            val name = getString(R.string.channel_remote_name)
//            val descriptionText = getString(R.string.channel_remote_description)
//            val importance = NotificationManager.IMPORTANCE_DEFAULT
//            val channel = NotificationChannel(channelId, name, importance).apply {
//                description = descriptionText
//            }
//            val manager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
//            manager.createNotificationChannel(channel)
//        }
//    }

    override fun onMessageReceived(message: RemoteMessage) {
        println(gson.toJson(message))
    }

    override fun onNewToken(token: String) {
        Log.d("FCMService", "FCM token $token")
    }

}