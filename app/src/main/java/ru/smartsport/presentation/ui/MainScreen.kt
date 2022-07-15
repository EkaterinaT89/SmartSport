package ru.smartsport.presentation.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ru.smartsport.R
import ru.smartsport.databinding.FragmentMainScreenBinding
import ru.smartsport.presentation.adapter.AdapterMySportsEvents
import ru.smartsport.presentation.viewModel.ViewModel

class MainScreen: Fragment() {

    val viewModel: ViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentMainScreenBinding.inflate(layoutInflater)

        binding.apply {

            val recyclerView =
                binding.root.findViewById(R.id.recycle_view) as RecyclerView
            recyclerView.layoutManager = GridLayoutManager(context, 1)

            viewModel.data.observe(viewLifecycleOwner){
                recyclerView.adapter = AdapterMySportsEvents(it)
            }

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