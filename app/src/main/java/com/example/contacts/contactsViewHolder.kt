package com.example.contacts

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class contactsViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){
        var tvname=itemView.findViewById<TextView>(R.id.tvname)
        var tvphonenumber=itemView.findViewById<TextView>(R.id.tvphonenumber)
        var tvemail=itemView.findViewById<TextView>(R.id.tvemail)
      }

