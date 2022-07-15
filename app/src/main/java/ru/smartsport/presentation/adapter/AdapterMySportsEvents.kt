package ru.smartsport.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.smartsport.databinding.SportsEventsItemBinding
import ru.smartsport.presentation.viewModel.SportsEvents

class AdapterMySportsEvents(
    private val value: List<SportsEvents>
): RecyclerView.Adapter<Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = SportsEventsItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return Holder(binding)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val sportsEvents = value[position]
        holder.bind(sportsEvents)
    }

    override fun getItemCount(): Int = value.size

}
class Holder(
   private val binding: SportsEventsItemBinding
): RecyclerView.ViewHolder(binding.root){
    fun bind(sportsEvents: SportsEvents){
        binding.apply {
            dateText.text = sportsEvents.date
            nameSport.text = sportsEvents.nameSport
        }
    }

}