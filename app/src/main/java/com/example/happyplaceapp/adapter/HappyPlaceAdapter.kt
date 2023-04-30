package com.example.happyplaceapp.adapter

import android.content.ClipData.Item
import android.content.Context
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.happyplaceapp.R
import com.example.happyplaceapp.databinding.ItemHappyPlaceBinding
import com.example.happyplaceapp.model.HappyPlaceModel


open class HappyPlacesAdapter(

    private val context: Context,
    private var list: ArrayList<HappyPlaceModel>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var onclickLisntener : OnClickListener? = null


    private class MyViewHolder(val binding: ItemHappyPlaceBinding) : RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding = ItemHappyPlaceBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MyViewHolder(binding)
    }


    fun setOnClickListener(onClickListener: OnClickListener){
        this.onclickLisntener = onClickListener
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val model = list[position]

        if (holder is MyViewHolder) {
          holder.binding.ivPlaceImage.setImageURI(Uri.parse(model.image))
            holder.binding.tvTitle.text = model.title
            holder.binding.tvDescription.text = model.description

            holder.itemView.setOnClickListener{
                if(onclickLisntener!= null){
                    onclickLisntener!!.onClick(position, model)
                }
            }
        }
    }



    interface OnClickListener{
        fun onClick(position: Int, model:HappyPlaceModel)
    }



    override fun getItemCount(): Int {
        return list.size
    }
}
