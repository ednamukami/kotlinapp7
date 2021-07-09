package com.example.contacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvcontacts: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displaycontacts()
    }
    fun displaycontacts(){
        var contactsList= listOf<Contacts>(
            Contacts(Name="edna",phonenumber="071234567",email="eddna@gmail.com")
        )
        rvcontacts= findViewById(R.id.rvcontacts)
        var contactsAdapter=ContactsRVAdapter(contactsList)
        rvcontacts.layoutManager= LinearLayoutManager(baseContext)
        rvcontacts.adapter=contactsAdapter
    }
}