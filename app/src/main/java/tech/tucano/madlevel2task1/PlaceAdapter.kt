package tech.tucano.madlevel2task1

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import tech.tucano.madlevel2task1.databinding.ItemPlaceBinding

class PlaceAdapter (private val places: List<Place>) :
    RecyclerView.Adapter<PlaceAdapter.ViewHolder>(){
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = ItemPlaceBinding.bind(itemView)

        fun databind(place: Place){
            binding.placeImg.setImageResource(place.imageResId)
            binding.placeLbl.text = place.name
        }
    }
}