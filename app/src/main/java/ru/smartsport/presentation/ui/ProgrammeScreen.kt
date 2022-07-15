package ru.smartsport.presentation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import carbon.view.VisibleView
import ru.smartsport.R
import ru.smartsport.databinding.FragmentProgrammeScreenBinding

class ProgrammeScreen:Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentProgrammeScreenBinding.inflate(layoutInflater)
binding.apply {

    buttonOpenList.setOnClickListener{
        binding.list.isVisible = !binding.list.isVisible
    }

    val item = bottomNavigation.menu.findItem(R.id.page_2)
    item.setChecked(true)
    bottomNavigation.setOnItemSelectedListener {item ->
        when(item.itemId){
            R.id.page_4 ->{
                findNavController().popBackStack()
                findNavController().navigate(R.id.accountScreen)
                true
            }
            R.id.page_3 -> {
                findNavController().popBackStack()
                findNavController().navigate(R.id.bonusProgramScreen)
                true
            }
            R.id.page_1 ->{
                findNavController().popBackStack()
                findNavController().navigate(R.id.mainScreen)
                true
            }

            else -> false
        }


    }
}


        return binding.root
    }
}