package com.example.hostelcare

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import org.jetbrains.anko.AnkoContext

class HelpAdapter(var list: ArrayList<HelpData> = arrayListOf()) : RecyclerView.Adapter<HelpAdapter.HelpViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HelpViewHolder {
        return HelpViewHolder(HelpUI().createView(AnkoContext.create(parent.context, parent)))
    }

    override fun onBindViewHolder(holder: HelpViewHolder, position: Int) {
        val movie = list[position]
        holder.tvTyp.text = movie.typ
        holder.tvUSN.text = movie.usn
        holder.tvDpno.text=movie.dpno
        holder.tvMesg.text=movie.mesg
        holder.tvDt.text=movie.dt
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class HelpViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var tvTyp: TextView
        var tvUSN: TextView
        var tvDpno: TextView
        var tvMesg: TextView
        var tvDt: TextView

        init {
            tvTyp = itemView.findViewById(HelpUI.tvTyp)
            tvUSN = itemView.findViewById(HelpUI.tvUSN)
            tvDpno= itemView.findViewById(HelpUI.tvDpno)
            tvMesg = itemView.findViewById(HelpUI.tvMesg)
            tvDt= itemView.findViewById(HelpUI.tvDt)
        }

    }
}
