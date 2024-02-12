package com.example.memoryapp.presentation.screens

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.memoryapp.R
import com.example.memoryapp.databinding.ScreenSplashBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashScreen : Fragment(R.layout.screen_splash) {
    private val binding by viewBinding(ScreenSplashBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val animationView = binding.animationView
        animationView.setAnimation("abs1.json")
        animationView.playAnimation()

        lifecycleScope.launch {
            delay(2500)
           findNavController().navigate(SplashScreenDirections.actionSplashScreenToMenuScreen())
        }


    }
}