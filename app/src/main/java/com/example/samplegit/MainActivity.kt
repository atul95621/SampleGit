package com.example.samplegit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("hello"," initial message")
        Log.e("new_branch"," branch1")

        Log.e("hello_new"," initial message")
        Log.e("branch"," master branch")

    }
}