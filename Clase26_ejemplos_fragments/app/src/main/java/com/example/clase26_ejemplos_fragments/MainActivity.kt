package com.example.clase26_ejemplos_fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.clase26_ejemplos_fragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.button.setOnClickListener { loadFragment(BlankFragment()) }
        binding.button2.setOnClickListener { loadFragment(BlankFragment2()) }
        binding.button3.setOnClickListener { loadFragment(BlankFragment3()) }
    }

    private fun loadFragment(fragment:Fragment){
        var fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(binding.layoutFragmentContainer.id,fragment)
        fragmentTransaction.commit()
    }
}