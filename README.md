# WordCloud
An advanced TextView to show a WordCloud

![alt tag](https://s7.postimg.org/6o2kb0x8b/word_Cloud.png)

##How To Use

###Steps

- Step 1 : Add WordCloud to your xml layout
```
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context="com.wordcloud.MainActivity">

    <ScrollView
        android:layout_width="match_parent"
        android:layout_height="match_parent">

        <com.wordcloud.WordCloud
            android:id="@+id/wordCloud"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:gravity="center"
            android:text="Hello" />

    </ScrollView>
    
</RelativeLayout>
```

- Step 2 : Create word cloud by calling method
            ```create(ArrayList<String)```
            This method will require and Arraylist of type string which are the words for the Word Cloud






