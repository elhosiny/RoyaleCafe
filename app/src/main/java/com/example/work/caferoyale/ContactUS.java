package com.example.work.caferoyale;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ContactUS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_us);
    }

    public void openFaceBook(View view) {

        Uri uri = Uri.parse("https://www.facebook.com/Ynisohle"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);

    }




    public void openTwitter(View view) {

        Uri uri = Uri.parse("https://twitter.com/ElhosinyA_Hamid"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);

    }
   public void openInstagram(View view){

       Uri uri = Uri.parse("https://www.instagram.com/elhosiny_a/"); // missing 'http://' will cause crashed
       Intent intent = new Intent(Intent.ACTION_VIEW, uri);
       startActivity(intent);
   }
}
