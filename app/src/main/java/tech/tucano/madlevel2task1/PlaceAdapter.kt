package tech.tucano.madlevel2task1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import tech.tucano.madlevel2task1.databinding.ItemPlaceBinding

class PlaceAdapter (private val places: List<Place>) :
    RecyclerView.Adapter<PlaceAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_place, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return places.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(places[position])
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


        val binding = ItemPlaceBinding.bind(itemView)


        fun bind(place : Place) {
            binding.placeIv.setImageResource(place.imageResId)
            binding.placeTxt.text = place.name
        }
    }
}