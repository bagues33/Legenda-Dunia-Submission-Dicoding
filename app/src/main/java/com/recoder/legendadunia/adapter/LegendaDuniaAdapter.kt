package com.recoder.legendadunia.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.recoder.legendadunia.DetailActivity
import com.recoder.legendadunia.R
import com.recoder.legendadunia.databinding.ItemLegendaDuniaBinding
import com.recoder.legendadunia.model.LegendaDunia

class LegendaDuniaAdapter(private var listLegendaDunia : ArrayList<LegendaDunia>) : RecyclerView.Adapter<LegendaDuniaAdapter.LegendaDuniaViewHolder>() {

    inner class LegendaDuniaViewHolder(private val itemLegendaDuniaBinding: ItemLegendaDuniaBinding) : RecyclerView.ViewHolder(itemLegendaDuniaBinding.root) {
        fun bindItem(legendaDunia: LegendaDunia) {
            // nama dan deskripsi pemain
            with(itemLegendaDuniaBinding){
                listName.text = legendaDunia.name
                listDescription.text = legendaDunia.description
            }

            // gambar tumbnails pemain
            Glide.with(itemView)
                .load(legendaDunia.thumbnail)
                .apply(RequestOptions.circleCropTransform())
                .into(itemLegendaDuniaBinding.listThumbnail)


            // detail activity
            itemView.setOnClickListener {
                val intent = Intent(itemView.context, DetailActivity::class.java)
                intent.putExtra(DetailActivity.EXTRA_LEGENDA_DUNIA, legendaDunia)
                itemView.context.startActivity(intent)
            }

        }

        // set thumbnails
        private fun setThumbnail(circle: Int) {
            itemLegendaDuniaBinding.listThumbnail.setBackgroundResource(circle)
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LegendaDuniaViewHolder {
        val adapter = ItemLegendaDuniaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return LegendaDuniaViewHolder(adapter)
    }

    override fun onBindViewHolder(holder: LegendaDuniaViewHolder, position: Int) {
        holder.bindItem(listLegendaDunia[position])
    }

    override fun getItemCount(): Int = listLegendaDunia.size
}