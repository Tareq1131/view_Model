package com.example.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider


class MainActivity : AppCompatActivity() {
    lateinit var textCounter:TextView
    lateinit var mainViewModel: MainViewModel //object for viewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        textCounter = findViewById(R.id.textTV)
        setText()
    }


     fun setText() {
         textCounter.text = mainViewModel.toString()
    }
}

private fun ViewModelProvider.get(modelClass: Class<MainViewModel>): MainViewModel {

}
