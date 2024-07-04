package com.example.premierleaguefixture

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.premierleaguefixture.databinding.FragmentListOfMatchesBinding

class ListOfMatches : Fragment() {
    private lateinit var binding: FragmentListOfMatchesBinding
    private lateinit var matchAdapter: MatchAdapter
    private lateinit var recyclerView: RecyclerView

    private var isGridLayoutManager = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListOfMatchesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val items = generateItems(25)

        matchAdapter = MatchAdapter()
        matchAdapter.setItem(items)

        recyclerView = binding.recyclerView

        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        recyclerView.adapter = matchAdapter



        binding.btnChangeView.setOnClickListener {
           isGridLayoutManager = !isGridLayoutManager
            if(isGridLayoutManager){
                recyclerView.layoutManager = GridLayoutManager(requireContext(), 3)
            } else {
                recyclerView.layoutManager = LinearLayoutManager(requireContext())
            }
        }
    }

    fun generateItems(count: Int): List<String>{
        var items = mutableListOf<String>()
        for(i in 0..count) {
            items.add("Item $i")
        }
        return items
        }
    }