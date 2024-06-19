package com.cindodcindy.pelmas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class PelmasHome extends AppCompatActivity {
    private FloatingActionButton floatingActionButton;
    private TextView textViewSearching;
    private RecyclerView recyclerView1St;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pelmas_home);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            floatingActionButton=findViewById(R.id.fabAddData);
            textViewSearching=findViewById(R.id.tv_home_search);
            recyclerView1St=findViewById(R.id.rv_home_data);

            textViewSearching.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(PelmasHome.this, PelmasSearch.class);
                    startActivity(intent);
                    finish();
                }
            });
            floatingActionButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(PelmasHome.this, PelmasAddData.class);
                    startActivity(intent);
                    finish();
                }
            });
            return insets;
        });
    }
}