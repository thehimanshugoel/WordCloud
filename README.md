# WordCloud
An advanced TextView to show a WordCloud

![alt tag](https://s7.postimg.org/6o2kb0x8b/word_Cloud.png)

##Download
Grab via gradle:

```compile 'com.himanshugoel.wordcloud:wordcloud:0.0.1'```

or Maven:
```<dependency>
  <groupId>com.himanshugoel.wordcloud</groupId>
  <artifactId>wordcloud</artifactId>
  <version>0.0.1</version>
  <type>pom</type>
</dependency>
 ```


##How To Use

###Steps

- Step 1 : Add WordCloud to your xml layout
```
        <com.wordcloud.WordCloud
            android:id="@+id/wordCloud"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:gravity="center"
            android:text="Hello" />
```

- Step 2 : Create word cloud by calling method
            ```create(ArrayList<String)```
            This method will require and Arraylist of type string which are the words for the Word Cloud
			


#Example

```
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

```






