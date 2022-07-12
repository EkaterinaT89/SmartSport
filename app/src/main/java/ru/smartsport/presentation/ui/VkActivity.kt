package ru.smartsport.presentation.ui

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.vk.api.sdk.VK
import com.vk.api.sdk.auth.VKAccessToken
import com.vk.api.sdk.auth.VKAuthCallback
import ru.smartsport.R

class VkActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vk)

        fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
            val callback = object : VKAuthCallback {

                override fun onLogin(token: VKAccessToken) {
                    // User passed authorization
                }

                override fun onLoginFailed(errorCode: Int) {
                    // User didn't pass authorization
                }
            }
            if (data == null || !VK.onActivityResult(
                    requestCode,
                    resultCode,
                    data,
                    callback
                )
            ) {
                super.onActivityResult(requestCode, resultCode, data)
            }
        }
    }
}