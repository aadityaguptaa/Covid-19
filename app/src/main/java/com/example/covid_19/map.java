package com.example.covid_19;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class map extends AppCompatActivity {

    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;



    private String rajasthanTotal = "0";
    private String haryanaTotal = "0";
    private String madhyaPradeshTotal = "0";
    private String maharashtraTotal = "0";
    private String telanganaTotal = "0";
    private String karnatakaTotal = "0";
    private String andhraPradeshTotal = "0";
    private String jammuAndKashmirTotal = "0";
    private String uttarPradeshTotal = "0";
    private String biharTotal = "0";
    private String chhattisgarhTotal = "0";
    private String westBengalTotal = "0";
    private String odissaTotal = "0";
    private String jharkhandTotal = "0";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference().child("states");

        final ImageView rajasthanImageView = findViewById(R.id.rajasthanPopup);
        final ImageView haryanaImageView = findViewById(R.id.haryanaPopup);
        final ImageView madhyaPradeshImageView = findViewById(R.id.madhyaPradeshPopup);
        final ImageView maharashtraImageView = findViewById(R.id.maharashtraPopup);
        final ImageView telanganaImageView = findViewById(R.id.telanganaPopup);
        final ImageView karnatakaImageView = findViewById(R.id.karnatakaPopup);
        final ImageView andhraPradeshImageView = findViewById(R.id.andhraPradeshPopup);
        final ImageView jammuAndKashmirImageView = findViewById(R.id.jammuAndKashmirPopup);
        final ImageView odissaImageView = findViewById(R.id.odissaPopup);
        final ImageView biharImageView = findViewById(R.id.biharPopup);
        final ImageView jharkhandImageView = findViewById(R.id.jharkhandPopup);
        final ImageView uttarPradeshImageView = findViewById(R.id.uttarPradeshPopup);
        final ImageView westBengalImageView = findViewById(R.id.westBengalPopup);
        final ImageView chhattisgarhImageView = findViewById(R.id.chhattisgarhPopup);

        final Button rajasthanButton = findViewById(R.id.rajasthan);
        final Button haryanaButton = findViewById(R.id.haryana);
        final Button madhyaPradeshButton = findViewById(R.id.madhyaPradesh);
        final Button maharashtraButton = findViewById(R.id.maharashtra);
        final Button telanganaButton = findViewById(R.id.telangana);
        final Button karnatakaButton = findViewById(R.id.karnataka);
        final Button andhraPradeshButton = findViewById(R.id.andhraPradesh);
        final Button andhraPradeshButton2 = findViewById(R.id.andhraPradesh2);
        final Button jammuAndKashmirButton = findViewById(R.id.jammuAndKashmir);
        final Button odissaButton = findViewById(R.id.odissa);
        final Button biharButton = findViewById(R.id.bihar);
        final Button jharkhandButton = findViewById(R.id.jharkhand);
        final Button uttarPradeshButton = findViewById(R.id.uttarPradesh);
        final Button westBengalButton = findViewById(R.id.westBengal);
        final Button chhattisgarhButton = findViewById(R.id.chhattisgarh);
        final Button chhattisgarhButton2 = findViewById(R.id.chhattisgarh2);


        final TextView rajasthanTextView = findViewById(R.id.rajasthanText);
        final TextView haryanaTextView = findViewById(R.id.haryanaTextView);
        final TextView madhyaPradeshTextView = findViewById(R.id.madhyaPradeshTextView);
        final TextView maharashtraTextView = findViewById(R.id.maharashtraTextView);
        final TextView telanganaTextView = findViewById(R.id.telanganaTextView);
        final TextView karnatakaTextView = findViewById(R.id.karnatakaTextView);
        final TextView andhraPradeshTextView = findViewById(R.id.andhraPradeshTextView);
        final TextView jammuAndKashmirTextView = findViewById(R.id.jammuAndKashmirTextView);
        final TextView odissaTextView = findViewById(R.id.odissaTextView);
        final TextView biharTextView = findViewById(R.id.biharTextView);
        final TextView jharkhandTextView = findViewById(R.id.jharkhandTextView);
        final TextView uttarPradeshTextView = findViewById(R.id.uttarPradeshTextView);
        final TextView westBengalTextView = findViewById(R.id.westBengalTextView);
        final TextView chhattisgarhTextView = findViewById(R.id.chhattisgarhTextView);



        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                rajasthanTotal = dataSnapshot.child("Rajasthan").getValue().toString();
                haryanaTotal = dataSnapshot.child("Haryana").getValue().toString();
                madhyaPradeshTotal = dataSnapshot.child("MadhyaPradesh").getValue().toString();
                maharashtraTotal = dataSnapshot.child("Maharashtra").getValue().toString();
                telanganaTotal = dataSnapshot.child("Telangana").getValue().toString();
                karnatakaTotal = dataSnapshot.child("Karnataka").getValue().toString();
                andhraPradeshTotal = dataSnapshot.child("AndhraPradesh").getValue().toString();
                jammuAndKashmirTotal = dataSnapshot.child("JammuAndKashmir").getValue().toString();
                odissaTotal = dataSnapshot.child("Odissa").getValue().toString();
                biharTotal = dataSnapshot.child("Bihar").getValue().toString();
                jharkhandTotal = dataSnapshot.child("Jharkhand").getValue().toString();
                uttarPradeshTotal = dataSnapshot.child("UttarPradesh").getValue().toString();
                westBengalTotal = dataSnapshot.child("WestBengal").getValue().toString();
                chhattisgarhTotal = dataSnapshot.child("Chhattisgarh").getValue().toString();

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


        rajasthanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rajasthanImageView.getVisibility() != View.VISIBLE){
                    rajasthanImageView.setVisibility(View.VISIBLE);

                    rajasthanTextView.setText(""+rajasthanTotal);}
                else {
                    rajasthanImageView.setVisibility(View.INVISIBLE);
                    rajasthanTextView.setText("");
                }

            }
        });
        haryanaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(haryanaImageView.getVisibility() != View.VISIBLE){
                    haryanaImageView.setVisibility(View.VISIBLE);

                    haryanaTextView.setText(""+haryanaTotal);}
                else {
                    haryanaImageView.setVisibility(View.INVISIBLE);
                    haryanaTextView.setText("");
                }

            }
        });
        madhyaPradeshButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(madhyaPradeshImageView.getVisibility() != View.VISIBLE){
                    madhyaPradeshImageView.setVisibility(View.VISIBLE);

                    madhyaPradeshTextView.setText(""+madhyaPradeshTotal);}
                else {
                    madhyaPradeshImageView.setVisibility(View.INVISIBLE);
                    madhyaPradeshTextView.setText("");
                }

            }
        });
        maharashtraButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(maharashtraImageView.getVisibility() != View.VISIBLE){
                    maharashtraImageView.setVisibility(View.VISIBLE);

                    maharashtraTextView.setText(""+maharashtraTotal);}
                else {
                    maharashtraImageView.setVisibility(View.INVISIBLE);
                    maharashtraTextView.setText("");
                }

            }
        });
        telanganaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(telanganaImageView.getVisibility() != View.VISIBLE){
                    telanganaImageView.setVisibility(View.VISIBLE);

                    telanganaTextView.setText(""+telanganaTotal);}
                else {
                    telanganaImageView.setVisibility(View.INVISIBLE);
                    telanganaTextView.setText("");
                }

            }
        });
        karnatakaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(karnatakaImageView.getVisibility() != View.VISIBLE){
                    karnatakaImageView.setVisibility(View.VISIBLE);

                    karnatakaTextView.setText(""+karnatakaTotal);}
                else {
                    karnatakaImageView.setVisibility(View.INVISIBLE);
                    karnatakaTextView.setText("");
                }

            }
        });
        andhraPradeshButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(andhraPradeshImageView.getVisibility() != View.VISIBLE){
                    andhraPradeshImageView.setVisibility(View.VISIBLE);

                    andhraPradeshTextView.setText(""+andhraPradeshTotal);}
                else {
                    andhraPradeshImageView.setVisibility(View.INVISIBLE);
                    andhraPradeshTextView.setText("");
                }

            }
        });
        andhraPradeshButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(andhraPradeshImageView.getVisibility() != View.VISIBLE){
                    andhraPradeshImageView.setVisibility(View.VISIBLE);

                    andhraPradeshTextView.setText(""+andhraPradeshTotal);}
                else {
                    andhraPradeshImageView.setVisibility(View.INVISIBLE);
                    andhraPradeshTextView.setText("");
                }

            }
        });
        jammuAndKashmirButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(jammuAndKashmirImageView.getVisibility() != View.VISIBLE){
                    jammuAndKashmirImageView.setVisibility(View.VISIBLE);

                    jammuAndKashmirTextView.setText(""+jammuAndKashmirTotal);}
                else {
                    jammuAndKashmirImageView.setVisibility(View.INVISIBLE);
                    jammuAndKashmirTextView.setText("");
                }

            }
        });
        chhattisgarhButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chhattisgarhImageView.getVisibility() != View.VISIBLE){
                    chhattisgarhImageView.setVisibility(View.VISIBLE);

                    chhattisgarhTextView.setText(""+chhattisgarhTotal);}
                else {
                    chhattisgarhImageView.setVisibility(View.INVISIBLE);
                    chhattisgarhTextView.setText("");
                }

            }
        });
        odissaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(odissaImageView.getVisibility() != View.VISIBLE){
                    odissaImageView.setVisibility(View.VISIBLE);

                    odissaTextView.setText(""+odissaTotal);}
                else {
                    odissaImageView.setVisibility(View.INVISIBLE);
                    odissaTextView.setText("");
                }

            }
        });
        jharkhandButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(jharkhandImageView.getVisibility() != View.VISIBLE){
                    jharkhandImageView.setVisibility(View.VISIBLE);

                    jharkhandTextView.setText(""+jharkhandTotal);}
                else {
                    jharkhandImageView.setVisibility(View.INVISIBLE);
                    jharkhandTextView.setText("");
                }

            }
        });
        biharButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(biharImageView.getVisibility() != View.VISIBLE){
                    biharImageView.setVisibility(View.VISIBLE);

                    biharTextView.setText(""+biharTotal);}
                else {
                    biharImageView.setVisibility(View.INVISIBLE);
                    biharTextView.setText("");
                }

            }
        });
        westBengalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(westBengalImageView.getVisibility() != View.VISIBLE){
                    westBengalImageView.setVisibility(View.VISIBLE);

                    westBengalTextView.setText(""+westBengalTotal);}
                else {
                    westBengalImageView.setVisibility(View.INVISIBLE);
                    westBengalTextView.setText("");
                }

            }
        });
        uttarPradeshButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(uttarPradeshImageView.getVisibility() != View.VISIBLE){
                    uttarPradeshImageView.setVisibility(View.VISIBLE);

                    uttarPradeshTextView.setText(""+uttarPradeshTotal);}
                else {
                    uttarPradeshImageView.setVisibility(View.INVISIBLE);
                    uttarPradeshTextView.setText("");
                }

            }
        });
        chhattisgarhButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chhattisgarhImageView.getVisibility() != View.VISIBLE){
                    chhattisgarhImageView.setVisibility(View.VISIBLE);

                    chhattisgarhTextView.setText(""+chhattisgarhTotal);}
                else {
                    chhattisgarhImageView.setVisibility(View.INVISIBLE);
                    chhattisgarhTextView.setText("");
                }

            }
        });

    }
}

