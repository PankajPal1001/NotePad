package com.example.notepad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RejisterActivity extends AppCompatActivity {
    Button Next2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rejister);
        Next2 = findViewById(R.id.Next2);

        Next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RejisterActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}