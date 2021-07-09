package com.example.contacts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactsRVAdapter (var contactsList: List<Contacts>):RecyclerView.Adapter<ContactsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.contacts_list_item,parent,false)
        return ContactsViewHolder(itemView)

    }
    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
       var contact = contactsList.get(position)
        holder.tvname.text=contact.Name
        holder.tvphonenumber.text=contact.phonenumber
        holder.tvemail.text=contact.email

    }


    override fun getItemCount(): Int {
        return  contactsList.size

    }




}
class ContactsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvname = itemView.findViewById<TextView>(R.id.tvname)
    var tvphonenumber = itemView.findViewById<TextView>(R.id.tvphonenumber)
    var tvemail = itemView.findViewById<TextView>(R.id.tvemail)
}

