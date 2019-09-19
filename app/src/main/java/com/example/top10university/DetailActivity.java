package com.example.top10university;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    public TextView textTitle, textD;
    public ImageView imgPt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imgPt = findViewById(R.id.foto_ft);
        textD = findViewById(R.id.detail_uni);
        textTitle = findViewById(R.id.title_dt);
        Universitas extra = getIntent().getParcelableExtra("objek");
        textTitle.setText(extra.getName());
        textD.setText(extra.getDetail());
        imgPt.setImageResource(extra.getPhoto());

    }
}
