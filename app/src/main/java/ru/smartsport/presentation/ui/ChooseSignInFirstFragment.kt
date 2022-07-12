package ru.smartsport.presentation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import ru.smartsport.R
import ru.smartsport.databinding.FragmentChooseSignInFirstBinding

class ChooseSignInFirstFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val binding = FragmentChooseSignInFirstBinding.inflate(
            inflater,
            container,
            false
        )

        with(binding) {
            nextButton.setOnClickListener {
                findNavController().navigate(R.id.chooseThemeFragment)
            }
            signInButton.setOnClickListener {
                findNavController().navigate(R.id.signUpFragment)
            }
        }

        return binding.root
    }

}