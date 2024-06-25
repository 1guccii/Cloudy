package com.example.weather.untils.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.weather.data.local.LocationData

class LocationRepository: ViewModel() {
    private val _sharedLocationData = MutableLiveData<LocationData>()
    val sharedLocationData: LiveData<LocationData> get() = _sharedLocationData
    fun updateLocationData(locationData: LocationData) {
        _sharedLocationData.postValue(locationData)
    }

}