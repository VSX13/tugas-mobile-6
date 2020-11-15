package com.example.jajanankekiniansurabaya

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.jajan_list_item.view.*

class JajanAdapter (val jajanItemList: List<JajanData>, val clickListener: (JajanData) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder> () {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.jajan_list_item, parent, false)
        return PartViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(jajanItemList[position], clickListener)
    }

    override fun getItemCount() = jajanItemList.size

    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(jajan: JajanData, clickListener: (JajanData) -> Unit) {
            itemView.tv_part_item_name.text = jajan.jajanName
            itemView.setOnClickListener{clickListener(jajan)}
        }
    }
}