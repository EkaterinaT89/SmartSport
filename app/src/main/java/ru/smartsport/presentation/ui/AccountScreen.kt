package ru.smartsport.presentation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.get
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import ru.smartsport.R
import ru.smartsport.databinding.FragmentAccountScreenBinding

class AccountScreen: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentAccountScreenBinding.inflate(layoutInflater)
        binding.apply {
            buttonAboutTheApp.setOnClickListener {
                findNavController().navigate(R.id.aboutApp)
            }
            buttonTeam.setOnClickListener {
                findNavController().navigate(R.id.myTeamScreen)
            }
            buttonHelpAndSupport.setOnClickListener {
                findNavController().navigate(R.id.supportScreen)
            }
            buttonOpenRegistration.setOnClickListener {
                findNavController().navigate(R.id.registrationScreen)
            }
            buttonSettingUpNotifications.setOnClickListener {
                TODO()
            }
            buttonYouLoveSports.setOnClickListener {
                findNavController().navigate(R.id.favoriteSportChooseFragment)
            }
            val item = bottomNavigation.menu.findItem(R.id.page_4)
            item.setChecked(true)
            bottomNavigation.setOnItemSelectedListener {item ->
                when(item.itemId){
                    R.id.page_2 ->{
                        findNavController().popBackStack()
                        findNavController().navigate(R.id.programmeScreen)
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