package com.example.work.caferoyale;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Toast;

import java.util.Locale;

public class Settings_locale extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_locale);
    }
    public void changeArabic(View view) {
        setLocale("ar");

        Toast toast = Toast.makeText(this , "تم تغيير اللغة", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void changeEnglish(View view){
        setLocale("en");
        Toast toast = Toast.makeText(this , "Language Has Been Changed", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void setLocale(String lang) {
        Locale myLocale = new Locale(lang);
        Resources res = getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
        conf.locale = myLocale;
        res.updateConfiguration(conf, dm);
        Intent refresh = new Intent(this,MainActivity.class);
        startActivity(refresh);
        finish();
    }
}
