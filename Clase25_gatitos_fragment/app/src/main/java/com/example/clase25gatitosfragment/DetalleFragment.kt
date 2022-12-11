package com.example.clase25gatitosfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.clase25gatitosfragment.databinding.FragmentDetalleBinding
import com.squareup.picasso.Picasso

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val DETALLE_FRAGMENT_PHOTO = "com.example.clase25.gatitos.fragment.photo.url"

class DetalleFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var url: String? = null


    private var _binding : FragmentDetalleBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            url = it.getString(DETALLE_FRAGMENT_PHOTO)

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentDetalleBinding.inflate(inflater,container,false)
        loadImage()
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {

        fun newInstance(url: String) =
            DetalleFragment().apply {
                arguments = Bundle().apply {
                    putString(DETALLE_FRAGMENT_PHOTO, url)
                }
            }
    }

    private fun loadImage(){
        Picasso.get().load(url).into(binding.imgGatito)
    }
}