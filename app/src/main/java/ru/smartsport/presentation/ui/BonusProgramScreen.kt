package ru.smartsport.presentation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import ru.smartsport.R
import ru.smartsport.databinding.FragmentBonusProgramBinding


class BonusProgramScreen: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentBonusProgramBinding.inflate(layoutInflater)

        binding.apply {

            buttonAboutTheApp.setOnClickListener{
                findNavController().navigate(R.id.partnersStockScreen)
            }
            buttonOpenGame.setOnClickListener{
                findNavController().navigate(R.id.gameJokesScreen)
            }
            buttonSouvenirsShop.setOnClickListener{
                findNavController().navigate(R.id.souvenirShopScreen)
            }
            buttonOpenList.setOnClickListener {
                findNavController().navigate(R.id.myProgressScreen)
            }


            val item = bottomNavigation.menu.findItem(R.id.page_3)
            item.setChecked(true)
            bottomNavigation.setOnItemSelectedListener {item ->
                when(item.itemId){
                    R.id.page_2 ->{
                        findNavController().popBackStack()
                        findNavController().navigate(R.id.programmeScreen)
                        true
                    }
                    R.id.page_4 -> {
                        findNavController().popBackStack()
                        findNavController().navigate(R.id.accountScreen)
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