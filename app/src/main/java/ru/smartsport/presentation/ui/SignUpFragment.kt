package ru.smartsport.presentation.ui

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.vk.api.sdk.VK
import com.vk.api.sdk.VKTokenExpiredHandler
import com.vk.api.sdk.auth.VKScope
import ru.smartsport.R
import ru.smartsport.databinding.FragmentSignUpBinding

class SignUpFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val binding = FragmentSignUpBinding.inflate(
            inflater,
            container,
            false
        )

//        //        Обработка авторизации токена VK:
        val tokenTracker = object : VKTokenExpiredHandler {
            override fun onTokenExpired() {
                view?.let {
                    Snackbar.make(
                        it,
                        R.string.vk_auth_error,
                        Snackbar.LENGTH_LONG
                    )
                        .show()
                }
            }
        }

        VK.addTokenExpiredHandler(tokenTracker)

        with(binding) {
            vkAuthButton.setOnClickListener {
                VK.login(context as Activity, arrayListOf(VKScope.WALL, VKScope.PHOTOS))
            }
            emailAuthButton.setOnClickListener {
                findNavController().navigate(R.id.emailAuthFragment)
            }
        }

        return binding.root
    }

}