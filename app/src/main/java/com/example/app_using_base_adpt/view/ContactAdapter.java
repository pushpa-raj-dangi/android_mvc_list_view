package com.example.app_using_base_adpt.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.app_using_base_adpt.R;
import com.example.app_using_base_adpt.model.Contact;

import java.util.List;

public class ContactAdapter extends BaseAdapter {

    Context context;
    private List<Contact> contacts;

    public ContactAdapter(Context context, List<Contact> contacts) {
        this.contacts = contacts;
        this.context = context;
    }

    @Override
    public int getCount() {
        return contacts.size();
    }

    @Override
    public Object getItem(int i) {
        return contacts.size();
    }

    @Override
    public long getItemId(int i) {
        return contacts.size();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(context).inflate(R.layout.contact_list,viewGroup,false);
        fillData(view,i);
        return view;
    }

    private void fillData(View view, int i) {
        LinearLayout linearLayout = view.findViewById(R.id.ph_layout);

        TextView tv = view.findViewById(R.id.contact_name);
        TextView tv_address = view.findViewById(R.id.contact_address);
        TextView tv_roll = view.findViewById(R.id.contact_phone);

        tv.setText(contacts.get(i).getName());
        tv_address.setText(contacts.get(i).getAddress());
        tv_roll.setText(contacts.get(i).getPhoneNumber());
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Name : "+contacts.get(i).getName(), Toast.LENGTH_SHORT).show();
            }
        });

    }

}
