package com.example.maptestapp.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.maptestapp.databinding.FragmentMyCityBinding
import com.example.maptestapp.domain.MyCityFragmentViewModel


class MyCityFragment : Fragment() {
    lateinit var binding: FragmentMyCityBinding
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: AdapterCity
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentMyCityBinding.inflate(layoutInflater,container,false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() {
        val viewModel = ViewModelProvider(this).get(MyCityFragmentViewModel::class.java)
        recyclerView = binding.rvCity
        adapter = AdapterCity()
        recyclerView.adapter = adapter
        viewModel.myCity.observe(viewLifecycleOwner,{list->adapter.setList(list.body()!!.asReversed())})

    }


}