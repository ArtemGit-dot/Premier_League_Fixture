package com.example.premierleaguefixture

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.premierleaguefixture.databinding.FragmentListOfMatchesBinding

class ListOfMatches : Fragment() {
    private lateinit var binding: FragmentListOfMatchesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListOfMatchesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnInformation.setOnClickListener {
            MAIN.navController.navigate(R.id.action_listOfMatches_to_matchInformation)

        }
    }
}