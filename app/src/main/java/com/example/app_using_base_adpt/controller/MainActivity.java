package com.example.app_using_base_adpt.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.app_using_base_adpt.R;
import com.example.app_using_base_adpt.model.DataModel;
import com.example.app_using_base_adpt.view.CustomAdapter;

public class MainActivity extends AppCompatActivity {

    private ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.list);

        DataModel dataModel = new DataModel();
        String[] address = dataModel.getAddress();
        String[] names = dataModel.getNames();
        int[]  roll  = dataModel.getRoll();

        list.setAdapter(new CustomAdapter(this,names,address,roll));
    }
}