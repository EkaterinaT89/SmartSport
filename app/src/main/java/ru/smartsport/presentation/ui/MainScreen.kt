package ru.smartsport.presentation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import ru.smartsport.R
import ru.smartsport.databinding.FragmentMainScreenBinding

class MainScreen: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentMainScreenBinding.inflate(layoutInflater)

        binding.apply {

            val item = bottomNavigation.menu.findItem(R.id.page_1)
            item.setChecked(true)
            bottomNavigation.setOnItemSelectedListener {item ->
                when(item.itemId){

                    R.id.page_4 -> {
                        findNavController().navigate(R.id.accountScreen)
                        true
                    }

                    R.id.page_2 ->{findNavController().navigate(R.id.programmeScreen)
                    true
                    }
                    R.id.page_3 -> {findNavController().navigate(R.id.bonusProgramScreen)
                    true}

                    else -> false
                }


            }
        }
        return binding.root
    }
}