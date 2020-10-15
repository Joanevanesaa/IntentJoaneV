package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tvNamaku;
    Button butBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        tvNamaku = findViewById(R.id.view_namaku);
        butBack = findViewById(R.id.Back);
        butBack.setOnClickListener(this);

    }

    public void onClick(View view) {
        Intent moveIntent = new Intent(ThirdActivity.this, MainActivity.class);
        startActivity(moveIntent);
    }
}
