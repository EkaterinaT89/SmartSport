package ru.smartsport.presentation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import carbon.view.VisibleView
import ru.smartsport.databinding.FragmentProgrammeScreenBinding

class ProgrammeScreen:Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentProgrammeScreenBinding.inflate(layoutInflater)

        binding.buttonOpenList.setOnClickListener{
            binding.list.isVisible = !binding.list.isVisible
        }
        return binding.root
    }
}