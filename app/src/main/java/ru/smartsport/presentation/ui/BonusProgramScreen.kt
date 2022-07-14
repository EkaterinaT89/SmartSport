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
        binding.buttonAboutTheApp.setOnClickListener{
            findNavController().navigate(R.id.partnersStockScreen)
        }
        binding.buttonOpenGame.setOnClickListener{
            findNavController().navigate(R.id.gameJokesScreen)
        }
        binding.buttonSouvenirsShop.setOnClickListener{
            findNavController().navigate(R.id.souvenirShopScreen)
        }
        binding.buttonOpenList.setOnClickListener {
            findNavController().navigate(R.id.myProgressScreen)
        }
        return binding.root
    }
}