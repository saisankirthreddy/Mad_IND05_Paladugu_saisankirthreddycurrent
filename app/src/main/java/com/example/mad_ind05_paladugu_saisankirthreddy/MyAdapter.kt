package com.example.mad_ind05_paladugu_saisankirthreddy

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mad_ind05_paladugu_saisankirthreddy.databinding.RecyclerviewRowBinding

class MyAdapter(val teamList: List<State1>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    inner class MyViewHolder(val binding: RecyclerviewRowBinding) : RecyclerView.ViewHolder(binding.root),
        View.OnClickListener{
        init {
            binding.root.setOnClickListener(this)
        }
        fun bindItem(state: State1) {
            binding.tvStateName.text = state.name
            binding.tvNickName.text = state.nickName
        }

        override fun onClick(p0: View?) {
            p0?.let {
                val context = it.context
                val  intent = Intent(context, MainActivity2::class.java)
                    .putExtra("rowNum", adapterPosition.toString())
                    .putExtra("name", binding.tvStateName.text)
                    .putExtra("area", teamList[adapterPosition].area)
                    .putExtra("map", teamList[adapterPosition].map)
                    .putExtra("flag", teamList[adapterPosition].flag )
                context.startActivity(intent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(RecyclerviewRowBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val state = teamList[position]
        holder.bindItem(state)
    }

    override fun getItemCount(): Int {
        return  teamList.size
    }
}