package com.example.covid_19;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
public class MythBusterActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myth_buster);
        final ListView list = findViewById(R.id.mythBusterList);
        ArrayList<SubjectData> arrayList = new ArrayList<SubjectData>();
        arrayList.add(new SubjectData("JAVA", "https://www.who.int/emergencies/diseases/novel-coronavirus-2019/advice-for-public/myth-busters", "https://www.who.int/images/default-source/health-topics/coronavirus/myth-busters/52.png"));
        arrayList.add(new SubjectData("Python", "https://www.who.int/emergencies/diseases/novel-coronavirus-2019/advice-for-public/myth-busters", "https://www.who.int/images/default-source/health-topics/coronavirus/myth-busters/mb-cold-snow.png"));
        arrayList.add(new SubjectData("Javascript", "https://www.who.int/emergencies/diseases/novel-coronavirus-2019/advice-for-public/myth-busters", "https://www.who.int/images/default-source/health-topics/coronavirus/myth-busters/mb-hot-bath.png"));
        arrayList.add(new SubjectData("Cprogramming", "https://www.who.int/emergencies/diseases/novel-coronavirus-2019/advice-for-public/myth-busters", "https://www.who.int/images/default-source/health-topics/coronavirus/myth-busters/mb-mosquito-bite.png"));
        arrayList.add(new SubjectData("Cplusplus", "https://www.who.int/emergencies/diseases/novel-coronavirus-2019/advice-for-public/myth-busters", "https://www.who.int/images/default-source/health-topics/coronavirus/myth-busters/mythbusters-27.png"));
        arrayList.add(new SubjectData("Android", "https://www.who.int/emergencies/diseases/novel-coronavirus-2019/advice-for-public/myth-busters", "https://www.who.int/images/default-source/health-topics/coronavirus/myth-busters/mythbusters-31.png"));
        arrayList.add(new SubjectData("Android", "https://www.who.int/emergencies/diseases/novel-coronavirus-2019/advice-for-public/myth-busters", "https://www.who.int/images/default-source/health-topics/coronavirus/myth-busters/mythbusters-33.png"));
        arrayList.add(new SubjectData("Android", "https://www.who.int/emergencies/diseases/novel-coronavirus-2019/advice-for-public/myth-busters", "https://www.who.int/images/default-source/health-topics/coronavirus/myth-busters/11.png"));
        arrayList.add(new SubjectData("Android", "https://www.who.int/emergencies/diseases/novel-coronavirus-2019/advice-for-public/myth-busters", "https://www.who.int/images/default-source/health-topics/coronavirus/myth-busters/19.png"));
        arrayList.add(new SubjectData("Android", "https://www.who.int/emergencies/diseases/novel-coronavirus-2019/advice-for-public/myth-busters", "https://www.who.int/images/default-source/health-topics/coronavirus/myth-busters/mythbuster-2.png"));
        arrayList.add(new SubjectData("Android", "https://www.who.int/emergencies/diseases/novel-coronavirus-2019/advice-for-public/myth-busters", "https://www.who.int/images/default-source/health-topics/coronavirus/myth-busters/mythbuster-3.png"));
        arrayList.add(new SubjectData("Android", "https://www.who.int/emergencies/diseases/novel-coronavirus-2019/advice-for-public/myth-busters", "https://www.who.int/images/default-source/health-topics/coronavirus/myth-busters/mythbuster-4.png"));
        arrayList.add(new SubjectData("Android", "https://www.who.int/emergencies/diseases/novel-coronavirus-2019/advice-for-public/myth-busters", "https://pbs.twimg.com/media/ETm_wQSUwAQjtjE.jpg"));
        arrayList.add(new SubjectData("Android", "https://www.who.int/emergencies/diseases/novel-coronavirus-2019/advice-for-public/myth-busters", "https://www.who.int/images/default-source/health-topics/coronavirus/myth-busters/mythbusters-25.png"));
        arrayList.add(new SubjectData("Android", "https://www.who.int/emergencies/diseases/novel-coronavirus-2019/advice-for-public/myth-busters", "https://www.who.int/images/default-source/health-topics/coronavirus/myth-busters/23.png"));



        CustomAdapter customAdapter = new CustomAdapter(this, arrayList);
        list.setAdapter(customAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                // Create a new intent to view the earthquake URI
                Intent websiteIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.who.int/emergencies/diseases/novel-coronavirus-2019/advice-for-public/myth-busters"));

                // Send the intent to launch a new activity
                startActivity(websiteIntent);
            }
        });
    }
}