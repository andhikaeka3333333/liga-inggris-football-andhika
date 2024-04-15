package com.example.ligainggrisandhika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PreviewTopScore extends AppCompatActivity {

    ImageView ivImagePemain, ivArrowBack;
    TextView tvNamaPemain, tvNamaClub, tvCountry;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview_top_score);

        ivImagePemain = findViewById(R.id.ivImagePemain);
        ivArrowBack = findViewById(R.id.ivArrowBack);
        tvNamaPemain = findViewById(R.id.tvNamaPemain);
        tvNamaClub = findViewById(R.id.tvNamaClub);
        tvCountry = findViewById(R.id.tvCountry);

        ivArrowBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        Intent intent = getIntent();
        String nama = intent.getStringExtra("nama");


        switch (nama) {
            case "Erling Haaland":
                ivImagePemain.setImageResource(R.drawable.haaland);
                tvNamaPemain.setText("Erling Haaland");
                tvNamaClub.setText("Manchester City");
                tvCountry.setText("Norway");
                break;
            case "Ollie Watkins":
                ivImagePemain.setImageResource(R.drawable.olliewatkins);
                tvNamaPemain.setText("Ollie Watkins");
                tvNamaClub.setText("Aston Villa");
                tvCountry.setText("England");
                break;
            case "Alexander Isak":
                ivImagePemain.setImageResource(R.drawable.alexanderisak);
                tvNamaPemain.setText("Alexander Isak");
                tvNamaClub.setText("Newcastle United");
                tvCountry.setText("Swedan");
                break;
            case "Mohammed Salah":
                ivImagePemain.setImageResource(R.drawable.salah);
                tvNamaPemain.setText("Mohammed Salah");
                tvNamaClub.setText("Liverpool");
                tvCountry.setText("Egypt");
                break;
            case "Dominic Solanke":
                ivImagePemain.setImageResource(R.drawable.dominicsolanke);
                tvNamaPemain.setText("Dominic Solanke");
                tvNamaClub.setText("Bournemouth");
                tvCountry.setText("England");
                break;
            case "Phill Fooden":
                ivImagePemain.setImageResource(R.drawable.phillfooden);
                tvNamaPemain.setText("Phill Fooden");
                tvNamaClub.setText("Manchester United");
                tvCountry.setText("England");
                break;
        }
    }
}