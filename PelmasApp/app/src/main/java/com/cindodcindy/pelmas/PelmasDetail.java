package com.cindodcindy.pelmas;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PelmasDetail extends AppCompatActivity {

    private TextView textViewtName, textViewTTL, textViewAlamat, textViewNoTelp,
            textViewBeratBadan, textViewTekananDarah, textViewGulaDarah,
            textViewAsamUrat, textViewKolesterol;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pelmas_detail);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            textViewtName=findViewById(R.id.tv_det_name);
            textViewTTL=findViewById(R.id.tv_det_ttl);
            textViewAlamat=findViewById(R.id.tv_det_alamat);
            textViewNoTelp=findViewById(R.id.tv_det_phone);
            textViewBeratBadan=findViewById(R.id.tv_det_bb);
            textViewTekananDarah=findViewById(R.id.tv_det_tekanan_darah);
            textViewGulaDarah=findViewById(R.id.tv_det_gula_darah);
            textViewAsamUrat=findViewById(R.id.tv_det_asama_urat);
            textViewKolesterol=findViewById(R.id.tv_det_kolesterol);
            return insets;
        });
    }
}