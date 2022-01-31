package com.example.app_using_base_adpt.view;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.example.app_using_base_adpt.R;

import org.w3c.dom.Text;

public class CustomAdapter extends BaseAdapter {

    private Context context;
    private String[] name;
    private String[] address;
    private  int[] roll_no;
    public CustomAdapter(Context c, String[] names, String[] addr, int[] roll) {
            this.context = c;
            this.name = names;
            this.address = addr;
            this.roll_no = roll;
    }


    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
//        if(view == null)
//        {
//            view  = LayoutInflater.from(context).inflate(R.layout.activity_main,viewGroup,false);
//        }
        view = LayoutInflater.from(context).inflate(R.layout.my_item,viewGroup,false);

        setUpData(view,i);
        return view;
    }


    private void setUpData(View view, int i) {
        LinearLayout linearLayout = view.findViewById(R.id.my_layout);
        TextView tv = view.findViewById(R.id.item_name);
        TextView tv_address = view.findViewById(R.id.item_address);
        TextView tv_roll = view.findViewById(R.id.item_roll);

        tv.setText(name[i]);
        tv_address.setText(address[i]);
        tv_roll.setText(address[i]);
        tv_roll.setText(String.valueOf(roll_no[i]));
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Name : "+name[i], Toast.LENGTH_SHORT).show();
            }
        });

    }
}
