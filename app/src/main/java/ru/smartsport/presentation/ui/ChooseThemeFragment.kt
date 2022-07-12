package ru.smartsport.presentation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import ru.smartsport.R
import ru.smartsport.databinding.FragmentChooseThemeBinding

class ChooseThemeFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val binding = FragmentChooseThemeBinding.inflate(
            inflater,
            container,
            false
        )

        with(binding) {
            footballNotChoose.setOnClickListener {
                footballChoose.visibility = View.VISIBLE
                chooseFootball.visibility = View.VISIBLE
                footballNotChoose.visibility = View.INVISIBLE
            }
            footballChoose.setOnClickListener {
                footballChoose.visibility = View.INVISIBLE
                chooseFootball.visibility = View.INVISIBLE
                footballNotChoose.visibility = View.VISIBLE
            }
            badmintonNotChoose.setOnClickListener {
                badmintonChoose.visibility = View.VISIBLE
                chooseBadminton.visibility = View.VISIBLE
                badmintonNotChoose.visibility = View.INVISIBLE
            }
            badmintonChoose.setOnClickListener {
                badmintonChoose.visibility = View.INVISIBLE
                chooseBadminton.visibility = View.INVISIBLE
                badmintonNotChoose.visibility = View.VISIBLE
            }
            basketballNotChoose.setOnClickListener {
                basketballChoose.visibility = View.VISIBLE
                chooseBasketball.visibility = View.VISIBLE
                basketballNotChoose.visibility = View.INVISIBLE
            }
            basketballChoose.setOnClickListener {
                basketballChoose.visibility = View.INVISIBLE
                chooseBasketball.visibility = View.INVISIBLE
                basketballNotChoose.visibility = View.VISIBLE
            }
            cyclingNotChoose.setOnClickListener {
                cyclingChoose.visibility = View.VISIBLE
                chooseCycling.visibility = View.VISIBLE
                cyclingNotChoose.visibility = View.INVISIBLE
            }
            cyclingChoose.setOnClickListener {
                cyclingChoose.visibility = View.INVISIBLE
                chooseCycling.visibility = View.INVISIBLE
                cyclingNotChoose.visibility = View.VISIBLE
            }
            tennisNotChoose.setOnClickListener {
                tennisChoose.visibility = View.VISIBLE
                chooseTennis.visibility = View.VISIBLE
                tennisNotChoose.visibility = View.INVISIBLE
            }
            tennisChoose.setOnClickListener {
                tennisChoose.visibility = View.INVISIBLE
                chooseTennis.visibility = View.INVISIBLE
                tennisNotChoose.visibility = View.VISIBLE
            }
            volleyballNotChoose.setOnClickListener {
                volleyballChoose.visibility = View.VISIBLE
                chooseVolleyball.visibility = View.VISIBLE
                volleyballNotChoose.visibility = View.INVISIBLE
            }
            volleyballChoose.setOnClickListener {
                volleyballChoose.visibility = View.INVISIBLE
                chooseVolleyball.visibility = View.INVISIBLE
                volleyballNotChoose.visibility = View.VISIBLE
            }
            fightingNotChoose.setOnClickListener {
                fightingChoose.visibility = View.VISIBLE
                chooseFighting.visibility = View.VISIBLE
                fightingNotChoose.visibility = View.INVISIBLE
            }
            fightingChoose.setOnClickListener {
                fightingChoose.visibility = View.INVISIBLE
                chooseFighting.visibility = View.INVISIBLE
                fightingNotChoose.visibility = View.VISIBLE
            }
            armrestlingNotChoose.setOnClickListener {
                armrestlingChoose.visibility = View.VISIBLE
                armrestlingChooseImage.visibility = View.VISIBLE
                armrestlingNotChoose.visibility = View.INVISIBLE
            }
            armrestlingChoose.setOnClickListener {
                armrestlingChoose.visibility = View.INVISIBLE
                armrestlingChooseImage.visibility = View.INVISIBLE
                armrestlingNotChoose.visibility = View.VISIBLE
            }
            lightNotChoose.setOnClickListener {
                lightChoose.visibility = View.VISIBLE
                lightChooseImage.visibility = View.VISIBLE
                lightNotChoose.visibility = View.INVISIBLE
            }
            lightChoose.setOnClickListener {
                lightChoose.visibility = View.INVISIBLE
                lightChooseImage.visibility = View.INVISIBLE
                lightNotChoose.visibility = View.VISIBLE
            }
            dartsNotChoose.setOnClickListener {
                dartsChoose.visibility = View.VISIBLE
                dartsChooseImage.visibility = View.VISIBLE
                dartsNotChoose.visibility = View.INVISIBLE
            }
            dartsChoose.setOnClickListener {
                dartsChoose.visibility = View.INVISIBLE
                dartsChooseImage.visibility = View.INVISIBLE
                dartsNotChoose.visibility = View.VISIBLE
            }
            gandballNotChoose.setOnClickListener {
                gandballChoose.visibility = View.VISIBLE
                gandballChooseImage.visibility = View.VISIBLE
                gandballNotChoose.visibility = View.INVISIBLE
            }
            gandballChoose.setOnClickListener {
                gandballChoose.visibility = View.INVISIBLE
                gandballChooseImage.visibility = View.INVISIBLE
                gandballNotChoose.visibility = View.VISIBLE
            }
            swimNotChoose.setOnClickListener {
                swimChoose.visibility = View.VISIBLE
                swimmingChoose.visibility = View.VISIBLE
                swimNotChoose.visibility = View.INVISIBLE
            }
            swimChoose.setOnClickListener {
                swimChoose.visibility = View.INVISIBLE
                swimmingChoose.visibility = View.INVISIBLE
                swimNotChoose.visibility = View.VISIBLE
            }
            saveButton.setOnClickListener {
                findNavController().navigate(R.id.setAlarmFragment)
            }
            laterButton.setOnClickListener {
                findNavController().navigate(R.id.setAlarmFragment)
            }

        }

        return binding.root
    }

}