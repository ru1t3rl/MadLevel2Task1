package tech.tucano.madlevel2task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import tech.tucano.madlevel2task1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}