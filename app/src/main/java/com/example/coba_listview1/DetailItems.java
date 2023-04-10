package com.example.coba_listview1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailItems extends AppCompatActivity {
    ImageView picture_received;
    TextView title_received,description_received;

    String title_key = "lists_key";
    String desc_key = "descriptions_key";
    int pictures_key;

    String title_valet;
    String desc_valet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_items);
        picture_received = findViewById(R.id.picture);
        title_received = findViewById(R.id.title);
        description_received = findViewById(R.id.description);

        Bundle bundle = getIntent().getExtras();

        pictures_key = bundle.getInt(String.valueOf("pictures_key"));
        title_valet = bundle.getString(title_key);
        desc_valet = bundle.getString(desc_key);

        picture_received.setImageResource(pictures_key);
        title_received.setText(title_valet);
        description_received.setText(desc_valet);
    }
}