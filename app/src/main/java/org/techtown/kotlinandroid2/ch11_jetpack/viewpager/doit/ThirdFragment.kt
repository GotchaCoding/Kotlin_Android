package com.example.ch11_jetpack


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import org.techtown.kotlinandroid2.databinding.FragmentThirdBinding
import org.techtown.kotlinandroid2.databinding.FragmentThreeBinding

class ThreeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return return FragmentThirdBinding.inflate(inflater, container, false).root
    }
}