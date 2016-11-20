package com.example.work.caferoyale;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.lang.reflect.Array;

public class ViewOrder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_order);
    }

    public void viewMyOrder(View view){

        EditText phoneET =(EditText) findViewById(R.id.ed);
        DBHelper dbh = new DBHelper(this ,null , null , 1) ;
        String [] customer= dbh.getCustomer(phoneET.getText().toString());

        Resources res = getResources();
        String []  vieworder = res.getStringArray(R.array.vieworder);

        customer [0] = vieworder[0] + customer[0];
        customer [1] = vieworder[1] + customer[1];
        customer [2] = vieworder[2] + customer[2];
        customer [3] = vieworder[3] + customer[3];
        ListView listView1 = (ListView) findViewById(R.id.lv);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, customer);
        listView1.setAdapter(adapter);
    }

    public void changeOrder(View view){

        startActivity(new Intent(this , Order.class));

    }
    }

