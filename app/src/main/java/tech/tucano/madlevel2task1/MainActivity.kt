package tech.tucano.madlevel2task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import tech.tucano.madlevel2task1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private val places = arrayListOf<Place>()
    private val placeAdapter = PlaceAdapter(places)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
    }

    private fun initViews(){
        binding.rvPlaces.layoutManager = StaggeredGridLayoutManager(2, RecyclerView.VERTICAL)
        binding.rvPlaces.adapter = placeAdapter

        for(i in Place.PLACE_NAMES.indices){
            places.add(Place(Place.PLACE_NAMES[i], Place.PLACE_RED_DRAWABLES_IDS[i]))
        }

        placeAdapter.notifyDataSetChanged()
    }
}