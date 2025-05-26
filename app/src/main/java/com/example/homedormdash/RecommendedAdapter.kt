package com.example.homedormdash

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecommendedAdapter(
    private val bhList: List<BoardingHouse>
) : RecyclerView.Adapter<RecommendedAdapter.BHViewHolder>() {

    class BHViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val bhName: TextView = itemView.findViewById(R.id.bhName)
        val bhLocation: TextView = itemView.findViewById(R.id.bhLocation)
        val bhOwner: TextView = itemView.findViewById(R.id.bhOwner)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BHViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_recommended, parent, false)
        return BHViewHolder(view)
    }

    override fun onBindViewHolder(holder: BHViewHolder, position: Int) {
        val bh = bhList[position]
        holder.bhName.text = bh.bh_name
        holder.bhLocation.text = bh.location
        holder.bhOwner.text = "Owner: ${bh.owner_name}"
    }

    override fun getItemCount(): Int = bhList.size
}
