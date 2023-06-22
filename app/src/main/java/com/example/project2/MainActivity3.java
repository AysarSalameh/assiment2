package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        RecyclerView recycler = findViewById(R.id.math_recycler);

        String[] captions = new String[mathmul.arry.length];
        int[] ids = new int[mathmul.arry.length];

        for(int i = 0; i<captions.length;i++){
            captions[i] = mathmul.arry[i].getName();
            ids[i] = mathmul.arry[i].getImageID();
        }
        recycler.setLayoutManager(new LinearLayoutManager(this));

        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(captions, ids);
        recycler.setAdapter(adapter);
    }
}