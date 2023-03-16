package com.balagtw.countries.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.balagtw.countries.R
import com.balagtw.countries.model.Country

class CountryListAdapter(var countries: ArrayList<Country>): RecyclerView.Adapter<CountryListAdapter.CountryViewHolder>() {


    fun updateCountries(newCountries: List<Country>){
        countries.clear()
        countries.addAll(newCountries)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = CountryViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_country, parent, false)
    )

    override fun getItemCount() = countries.size

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        holder.bind(countries[position])
    }

    class CountryViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val countryName = itemView.findViewById<TextView>(R.id.tv_name)
        fun bind(country: Country){
            countryName.text = country.countryName
        }
    }

}