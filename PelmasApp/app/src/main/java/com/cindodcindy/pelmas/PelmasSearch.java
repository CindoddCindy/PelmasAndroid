package com.cindodcindy.pelmas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.SearchView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class PelmasSearch extends AppCompatActivity {
    private SearchView searchView;
    private FloatingActionButton floatingActionButtonSearch;
    private RecyclerView recyclerViewSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pelmas_search);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            searchView=findViewById(R.id.pelmas_search_by_name);
            floatingActionButtonSearch=findViewById(R.id.fab_search_add_data);
            recyclerViewSearch=findViewById(R.id.pelmas_search);

            floatingActionButtonSearch.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(PelmasSearch.this,PelmasAddData.class);
                    startActivity(intent);
                }
            });
            return insets;
        });
    }
}