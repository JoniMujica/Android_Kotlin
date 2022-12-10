package com.example.clase24

import android.content.Context
import android.content.Context.INPUT_METHOD_SERVICE
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.core.content.ContextCompat.getSystemService
import com.example.clase24.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    var listener : MessageListener? = null


    private var _binding : FragmentLoginBinding?  = null
    private val binding get() = _binding!!

    private var user = "pepito"
    private var pass = "1234"

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as MessageListener
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentLoginBinding.inflate(inflater,container,false)
        binding.btnLogin.setOnClickListener { validarIdentidad()
            vaciarCasilleros()
            ocultarTeclado()}
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun sendMessage(){
        listener?.let {
            it.onSendMessage(binding.etUser.text.toString())
        }
    }
    private fun validarIdentidad(){
        if (binding.etUser.text.toString().equals(user) && binding.etPass.text.toString().equals(pass)){
            Toast.makeText(context,"Bienvenido",Toast.LENGTH_LONG).show()
            sendMessage()
        }else{
            Toast.makeText(context,"Revise sus credenciales",Toast.LENGTH_LONG).show()
        }
    }

    private fun vaciarCasilleros(){
        binding.etUser.setText("")
        binding.etPass.setText("")
        binding.etUser.requestFocus()
    }
    private fun ocultarTeclado(){
        val imm : InputMethodManager = activity?.getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(binding.etPass.windowToken,0)
    }

    interface MessageListener{
        fun onSendMessage(msg:String)
    }

}