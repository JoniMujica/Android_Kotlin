package com.example.clase25gatitosfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import com.example.clase25gatitosfragment.databinding.FragmentGatitosBinding
import com.squareup.picasso.Picasso


class GatitosFragment : Fragment() {

    private var _binding : FragmentGatitosBinding? = null
    private val binding get() = _binding!!

    val foto1 = "https://placekitten.com/200/300"
    val foto2 = "https://placekitten.com/300/300"
    val foto3 = "https://placekitten.com/400/300"
    val foto4 = "https://placekitten.com/300/400"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentGatitosBinding.inflate(inflater,container,false)
        loadImages()
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun loadImages(){
        Picasso.get().load(foto1).into(binding.imgFoto1)
        Picasso.get().load(foto2).into(binding.imgFoto2)
        Picasso.get().load(foto3).into(binding.imgFoto3)
        Picasso.get().load(foto4).into(binding.imgFoto4)

    }

}