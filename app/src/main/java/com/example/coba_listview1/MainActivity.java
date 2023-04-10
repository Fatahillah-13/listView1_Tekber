package com.example.coba_listview1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

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
        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String Lists = countryList[position].toString();
                int pictures = pic[position];
                String descriptions = desc[position].toString();

                //Toast.makeText(MainActivity.this,""+pictures, Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this,DetailItems.class);
                intent.putExtra("lists_key",Lists);
                intent.putExtra("pictures_key",pictures);
                intent.putExtra("descriptions_key",descriptions);
                startActivity(intent);
            }
        });
    }
}