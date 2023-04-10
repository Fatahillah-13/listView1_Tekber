package com.example.coba_listview1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ListView;

public class MainActivity extends Activity {

    ListView simpleList;
    String countryList[]={
      "A",
      "B",
      "C",
      "D",
      "E",
      "F",
    };
    int pic[]={
        R.drawable.anggur,
        R.drawable.apel,
        R.drawable.durian,
        R.drawable.jeruk,
        R.drawable.mangga,
        R.drawable.pisang,
    };

    String desc[]={
            "Description A",
            "Description B",
            "Description C",
            "Description D",
            "Description E",
            "Description F",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleList = (ListView) findViewById(R.id.simpleListVIew);
        //custom adapter in here....
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(),countryList,pic,desc);
        simpleList.setAdapter(customAdapter);
    }
}