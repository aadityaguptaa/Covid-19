package com.example.covid_19;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.squareup.picasso.Picasso;

public class Menu extends AppCompatActivity {

    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Log.i("ee", "menuActivity");

        CardView liveCountCardView = findViewById(R.id.livecount);
        liveCountCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this,map.class);
                startActivity(intent);
            }
        });
        CardView NewsCardView = findViewById(R.id.newsLive);
        NewsCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this,News.class);
                startActivity(intent);
            }
        });
        CardView MythBusterView = findViewById(R.id.mythBuster);
        MythBusterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this,MythBusterActivity.class);
                startActivity(intent);
            }
        });
        firebaseAuth = FirebaseAuth.getInstance();
        FirebaseUser user = firebaseAuth.getCurrentUser();
        Uri useruri = user.getPhotoUrl();

        ImageView imag = findViewById(R.id.menuUserImage);
        Picasso.with(this)
                .load(useruri)
                .into(imag);


    }
}
