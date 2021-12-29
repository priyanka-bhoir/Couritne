    package com.priyanka.couritne

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

    class MainActivity : AppCompatActivity() {
        val TAG = "MainActivity";
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GlobalScope.launch {
            Log.e(TAG, "onCreate: corutine says hii!! ${Thread.currentThread().name}", )
        }
        Log.e(TAG, "onCreate: ain says hii!! ${Thread.currentThread().name}", )

    }
}