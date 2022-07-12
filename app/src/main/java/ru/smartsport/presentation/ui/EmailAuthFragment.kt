package ru.smartsport.presentation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.smartsport.databinding.FragmentEmailAuthBinding

class EmailAuthFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val binding = FragmentEmailAuthBinding.inflate(
            inflater,
            container,
            false
        )

        with(binding) {
            nextButton.setOnClickListener {

            }
        }

        return binding.root
    }

}