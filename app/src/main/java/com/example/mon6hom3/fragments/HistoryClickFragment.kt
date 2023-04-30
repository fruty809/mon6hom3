package com.example.mon6hom3.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.mon6hom3.ViewModel.CounterViewModel
import com.example.mon6hom3.databinding.FragmentHistoryClickBinding


class HistoryClicksFragment : Fragment() {
    private lateinit var binding: FragmentHistoryClickBinding
    private var viewModel: CounterViewModel? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHistoryClickBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity())[CounterViewModel::class.java]
        viewModel!!.operation.observe(viewLifecycleOwner, Observer {
            binding.tvHistory.text = it.toString()
        })

    }
}