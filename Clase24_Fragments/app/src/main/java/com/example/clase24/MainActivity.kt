package com.example.clase24

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.clase24.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loadFragment()
    }
    private fun loadFragment(){
        val loginFragment = LoginFragment()
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(binding.layoutFragmentContainer.id,loginFragment)
        fragmentTransaction.commit()

    }
}