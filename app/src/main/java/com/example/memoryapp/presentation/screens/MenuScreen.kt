package com.example.memoryapp.presentation.screens

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.memoryapp.R
import com.example.memoryapp.databinding.ScreenMenuBinding

class MenuScreen:Fragment(R.layout.screen_menu) {
    private val binding by viewBinding ( ScreenMenuBinding::bind )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    }
}