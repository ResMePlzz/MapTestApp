package com.example.maptestapp.presentation

import android.content.ContentValues.TAG
import android.location.LocationListener
import android.os.Bundle
import android.os.LocaleList
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.maptestapp.databinding.FragmentMapBinding
import com.example.maptestapp.domain.MapFragmentViewModel
import com.example.maptestapp.domain.MapKitModel.CountryModel
import com.example.maptestapp.domain.MapKitModel.Response
import com.yandex.mapkit.Animation
import com.yandex.mapkit.MapKitFactory
import com.yandex.mapkit.geometry.Point
import com.yandex.mapkit.map.CameraPosition
import kotlinx.android.synthetic.main.fragment_map.*


class MapFragment : Fragment() {
    lateinit var binding: FragmentMapBinding
    lateinit var viewModel:MapFragmentViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MapKitFactory.initialize(context)



    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentMapBinding.inflate(layoutInflater, container, false)
        return binding.root





    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()


    }

    private fun init() {
        viewModel = ViewModelProvider(this)[MapFragmentViewModel::class.java]
        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener,
            androidx.appcompat.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                Log.d("SEARCH_CITY","presstextsubmit")
                viewModel.getCity(city = query)
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                Log.d("SEARCH_CITY", "presstextchange $newText")
                return true
            }

        })


        binding.mapview.map.move(CameraPosition(Point(59.945933, 30.320045),
            14.0F,0.0F,0.0F))
    }

    override fun onStop() {
        super.onStop()
        binding.mapview.onStop()
        MapKitFactory.getInstance().onStop()

    }

    override fun onStart() {
        super.onStart()
        binding.mapview.onStart()
        MapKitFactory.getInstance().onStart()

    }
    }

