package com.balagtw.countries.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.balagtw.countries.model.Country

class ListViewModel: ViewModel() {

    val countries = MutableLiveData<List<Country>>()
    val countryLoadError = MutableLiveData<Boolean>()
    val loading = MutableLiveData<Boolean>()

    fun refresh(){
        fetchCountries()
    }

    private fun fetchCountries() {
        val mockData = listOf(Country("India"),
            Country("US"),
            Country("Italy"),
            Country("Canada"),
            Country("England"),
            Country("Australia"),
            Country("Pakistan"),
            Country("UK"),
            Country("Srilanka"),
            )

        countryLoadError.value = false
        loading.value = false

        countries.value = mockData
    }
}