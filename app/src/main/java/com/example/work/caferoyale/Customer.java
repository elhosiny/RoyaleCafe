package com.example.work.caferoyale;

/**
 * Created by elhosiny on 11/12/2016.
 */


public class Customer
{
    String Phone;
    String Name ;
    String Drink ;
    String Meal ;
    String Others ;

    public Customer() {

    }

    public Customer(String phone, String name, String drink, String meal, String others) {
        Phone = phone;
        Name = name;
        Drink = drink;
        Meal = meal;
        Others = others;
    }

    public String getPhone() {
        return Phone;
    }

    public String getName() {
        return Name;
    }

    public String getDrink() {
        return Drink;
    }

    public String getMeal() {
        return Meal;
    }

    public String getOthers() {
        return Others;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setDrink(String drink) {
        Drink = drink;
    }

    public void setMeal(String meal) {
        Meal = meal;
    }

    public void setOthers(String others) {
        Others = others;
    }
}
