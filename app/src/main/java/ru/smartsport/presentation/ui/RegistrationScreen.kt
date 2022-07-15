package ru.smartsport.presentation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import ru.smartsport.R
import ru.smartsport.databinding.FragmentRegistrationBinding
import ru.smartsport.presentation.viewModel.ViewModel

class RegistrationScreen: Fragment() {
    private val viewModel:ViewModel by activityViewModels()
    private var sportTitle = ""
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentRegistrationBinding.inflate(layoutInflater)


        binding.apply {
            footballText.setOnClickListener{
                sportTitle = "Футбол"
                footballText.setBackgroundResource(R.drawable.background_text)
                basketballText.setBackgroundResource(R.color.grey)
                tennisText.setBackgroundResource(R.color.grey)
            }

            basketballText.setOnClickListener {
                sportTitle = "Баскетбол"
                footballText.setBackgroundResource(R.color.grey)
                basketballText.setBackgroundResource(R.drawable.background_text)
                tennisText.setBackgroundResource(R.color.grey)
            }

            tennisText.setOnClickListener {
                sportTitle = "Тенис"
                footballText.setBackgroundResource(R.color.grey)
                basketballText.setBackgroundResource(R.color.grey)
                tennisText.setBackgroundResource(R.drawable.background_text)
            }


            nextButton.setOnClickListener {
                viewModel.addSportsEvents(sportTitle)
                findNavController().navigate(R.id.confirmationRegistrationScreen)
            }
        }
        return binding.root
    }
}