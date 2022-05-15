package com.sumin.shoppinglist.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.airbnb.lottie.LottieAnimationView
import com.sumin.shoppinglist.R
import com.sumin.shoppinglist.databinding.ActivitySplashBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashActivity : AppCompatActivity() {

    lateinit var binding:ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        CoroutineScope(Dispatchers.Main).launch {

        with(binding.animationView){
            delay(3000)
            setMinAndMaxFrame(30,50)
        }
            startActivity(Intent(this@SplashActivity,MainActivity::class.java))
        }
    }
}