package com.akirachix.blogreaderapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BlogAdapter(var authors: List<Blog>):RecyclerView.Adapter<Authors>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Authors {
        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.authordetails,parent,false)
        return Authors(itemView)

    }

    override fun onBindViewHolder(holder: Authors, position: Int) {
        val authorList=authors[position]
        holder.rvWriter.text=authorList.author
        holder.rvDolls.text=authorList.book
        holder.tvPublication.text=authorList.publication
        holder.tvTitle.text=authorList.title
        holder.tvSummary.text=authorList.text
        holder.tvAuthor.text=authorList.name
        holder.button.text=authorList.btn


    }

    override fun getItemCount(): Int {
        return authors.size

    }
}
    class Authors(itemView: View):RecyclerView.ViewHolder(itemView) {
        var rvWriter=itemView.findViewById<TextView>(R.id.rvWriter)
        var rvDolls=itemView.findViewById<TextView>(R.id.rvDolls)
        var tvAuthor=itemView.findViewById<TextView>(R.id.tvAuthor)
        var tvPublication=itemView.findViewById<TextView>(R.id.tvPublication)
        var tvSummary=itemView.findViewById<TextView>(R.id.tvSummary)
        var button=itemView.findViewById<TextView>(R.id.button)
        var tvTitle=itemView.findViewById<TextView>(R.id.tvTitle)




    }
