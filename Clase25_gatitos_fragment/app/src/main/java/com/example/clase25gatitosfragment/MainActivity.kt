package com.example.clase25gatitosfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.clase25gatitosfragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), GatitosFragment.GatitosListener {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loadFragment(GatitosFragment())
    }

    private fun loadFragment(fragment: Fragment){
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(binding.layoutPadre.id,fragment)
        fragmentTransaction.addToBackStack(null) //con esto bloqueo que al apretar el boton "atras o volver" del celular,  se cierre la app
        fragmentTransaction.commit()
    }

    override fun onClickPhoto(url: String) {
        val dellaFragment = DetalleFragment.newInstance(url)
        loadFragment(dellaFragment)
    }
}