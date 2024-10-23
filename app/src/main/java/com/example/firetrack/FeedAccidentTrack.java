package com.example.firetrack;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FeedAccidentTrack extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_feed_accident_track);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.mainFeed), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button fab = findViewById(R.id.fab);
        LinearLayout floatingMenu = findViewById(R.id.floatingMenu);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (floatingMenu.getVisibility() == View.GONE) {
                    floatingMenu.setVisibility(View.VISIBLE);
                } else {
                    floatingMenu.setVisibility(View.GONE);
                }
            }
        });

        Button getLocationButton = findViewById(R.id.getLocationButton);
        Button addPhotoButton = findViewById(R.id.addPhotoButton);
        Button addTagsButton = findViewById(R.id.addTagsButton);

        getLocationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pegar a localização ou abrir o maps
            }
        });

        addPhotoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Adicionar uma foto
            }
        });

        addTagsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Adicionar tags predefinidas
            }
        });
    }
}

