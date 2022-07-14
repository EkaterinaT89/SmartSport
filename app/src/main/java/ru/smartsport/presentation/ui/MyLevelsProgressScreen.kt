package ru.smartsport.presentation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.smartsport.databinding.FragmentLevelsProgressBinding

class MyLevelsProgressScreen: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentLevelsProgressBinding.inflate(layoutInflater)
        return binding.root
    }
}