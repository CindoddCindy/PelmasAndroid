package com.cindodcindy.pelmas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PelmasAddData extends AppCompatActivity {
    private Button buttonSaveData;
    private EditText editTextName, editTextTTL, editTextAlamat, editTextNoTelp,
    editTextBeratBadan, editTextTekananDarah, editTextGulaDarah, editTextAsamUrat, editTextKolesterol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pelmas_add_data);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            buttonSaveData=findViewById(R.id.btn_save_data);
            editTextName=findViewById(R.id.et_add_name);
            editTextTTL=findViewById(R.id.et_add_ttl);
            editTextAlamat=findViewById(R.id.et_add_alamat);
            editTextNoTelp=findViewById(R.id.et_add_no_telp);
            editTextBeratBadan=findViewById(R.id.et_add_bb);
            editTextTekananDarah=findViewById(R.id.et_add_tekanan_darah);
            editTextGulaDarah=findViewById(R.id.et_add_gula_darah);
            editTextAsamUrat=findViewById(R.id.et_add_asam_urat);
            editTextKolesterol=findViewById(R.id.et_add_kolesterol);

            buttonSaveData.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(PelmasAddData.this, PelmasHome.class);
                    startActivity(intent);
                    finish();
                }
            });
            return insets;
        });
    }
}