package com.wordcloud;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<String> arrayString;
    WordCloud wordCloud;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wordCloud = (WordCloud) findViewById(R.id.wordCloud);

        arrayString = new ArrayList<>();
        arrayString.add("Awesome Place with awesome Food");
        arrayString.add("Ultimate Driving Machine");
        arrayString.add("Runs on the newest version of Android");
        arrayString.add("Super Cool Interiors");
        arrayString.add("Food Menu is lengthy");
        arrayString.add("Try zucchini crips,they are amazing");
        arrayString.add("Non veg Platter os really nice");
        arrayString.add("Another Awesome thing");
        arrayString.add("Eric Bailly, ideal defender for premier league");
        arrayString.add("Won Afric cup of nation 2015-IvoryCoast");
        arrayString.add("Windows Interface is useful");
        arrayString.add("Video Playback is incredible");
        arrayString.add("Secondary camera is decent");
        arrayString.add("Another Awesome thing");
        arrayString.add("Call Quality is very clear");
        arrayString.add("Uncomfortable to hold and use,but having a fantasting battery life");
        arrayString.add("Robust Build");
        arrayString.add("Parking issues-valet parking available");
        arrayString.add("A dedicated smoking area");
        arrayString.add("recommended with family and friends");
        arrayString.add("less space os letdown issue");
        arrayString.add("Serice is good and quick ,should incude more dessers in the menu");

        wordCloud.create(arrayString);

        wordCloud.setRandomSize(20, 100);

        wordCloud.setRandomTextColor();
        wordCloud.setRandomFonts();

        wordCloud.setCloudTextColor("#FFC107");

        wordCloud.setOnWordClickListener(new WordCloudClick() {
            @Override
            public void onWordClick(View widget, int index) {
                Toast.makeText(getApplicationContext(), arrayString.get(index), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
