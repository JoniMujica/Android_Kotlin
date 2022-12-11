package com.example.clase26_retrofit2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.SearchView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.clase26_retrofit2.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create


private lateinit var adapter : DogAdapter
private  val dogImages = mutableListOf<String>()


class MainActivity : AppCompatActivity(), SearchView.OnQueryTextListener {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()

        binding.svRaza.setOnQueryTextListener(this)
    }

    private fun getRetrofit():Retrofit{
        return Retrofit
            .Builder()
            .baseUrl("https://dog.ceo/api/breed/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        //importante, siempre finalizar con una barra las url de base
    }

    private fun searchByName(query:String){
        CoroutineScope(Dispatchers.IO).launch {
            val call = getRetrofit().create(ApiService::class.java).getDogsByBreads("$query/images")
            val dogs = call.body()
            runOnUiThread {
                if (call.isSuccessful){
                    val images = dogs?.images ?: emptyList()
                    dogImages.clear()
                    dogImages.addAll(images)
                    adapter.notifyDataSetChanged()
                }else{
                    showError()
                }
                ocultarTeclado()
            }
        }
    }

    private fun ocultarTeclado() {
        val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(binding.svRaza.windowToken,0)
    }

    private  fun showError(){
        Toast.makeText(this,"Ocurrio un error",Toast.LENGTH_LONG).show()
    }
    private fun initRecyclerView(){
        adapter = DogAdapter(dogImages)
        binding.rvPerritos.layoutManager = LinearLayoutManager(this)
        binding.rvPerritos.adapter = adapter
    }

    override fun onQueryTextSubmit(query: String?): Boolean {
        if (!query.isNullOrEmpty()) searchByName(query.lowercase())
        return true
    }

    override fun onQueryTextChange(p0: String?): Boolean {
        return true
    }
}