package com.example.app_using_base_adpt.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.example.app_using_base_adpt.R;
import com.example.app_using_base_adpt.model.Contact;
import com.example.app_using_base_adpt.repository.ContactRepository;
import com.example.app_using_base_adpt.repository.IContactRepository;
import com.example.app_using_base_adpt.view.ContactAdapter;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView list;

    private IContactRepository  repository = new ContactRepository();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
         List<Contact> contactList = repository.getContacts();



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = findViewById(R.id.list);

        list.setAdapter(new ContactAdapter(this,contactList));
    }
}