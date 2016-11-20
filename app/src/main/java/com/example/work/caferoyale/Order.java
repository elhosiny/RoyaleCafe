package com.example.work.caferoyale;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Order extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order);

    }
    public void  orderNow(View view){

        EditText phone = (EditText) findViewById(R.id.phone) ;
        EditText drink = (EditText) findViewById(R.id.drink) ;
        EditText meal = (EditText) findViewById(R.id.meal) ;
        EditText others = (EditText) findViewById(R.id.others) ;


        Customer customer = new Customer() ;

        customer.setPhone(phone.getText().toString());
        customer.setDrink(drink.getText().toString());
        customer.setMeal(meal.getText().toString());
        customer.setOthers(others.getText().toString());
        DBHelper dbh = new DBHelper(this ,null , null , 1) ;
        dbh.updateCustomer(customer);
        Toast toast =Toast.makeText(this,"Ordered", Toast.LENGTH_SHORT);
        toast.show();

    }

    public void viewOrder(View view){

        startActivity(new Intent(this , ViewOrder.class));
    }

}
