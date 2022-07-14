package ru.smartsport.presentation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import ru.smartsport.R
import ru.smartsport.databinding.FragmentMyProgressBinding

class MyProgressScreen: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentMyProgressBinding.inflate(layoutInflater)

        binding.buttonOpenLevelsProgress.setOnClickListener {
            findNavController().navigate(R.id.myLevelsProgressScreen)
        }
        return binding.root
    }
}