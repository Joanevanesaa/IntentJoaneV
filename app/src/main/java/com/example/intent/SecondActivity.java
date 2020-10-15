package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tvNama, tvInstitusi;
    Button butActivity3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvNama = findViewById(R.id.view_nama);
        tvInstitusi = findViewById(R.id.view_institusi);

        butActivity3 = findViewById(R.id.pindah_act_3);
        butActivity3.setOnClickListener(this);

        String nama = getIntent().getStringExtra(MainActivity.EXTRA_NAMA);
        String institusi = getIntent().getStringExtra(MainActivity.EXTRA_INSTITUSI);

        if (TextUtils.isEmpty(nama)) {
            tvNama.setText("Nama :");
        } else {
            tvNama.setText("Nama : " + nama);
        }
        if (TextUtils.isEmpty(institusi)) {
            tvInstitusi.setText("Nama Institusi : ");
        } else {
            tvInstitusi.setText("Nama Institusi : " + institusi);
        }
    }

        public void onClick (View view){
        Intent moveIntent = new Intent(SecondActivity.this, ThirdActivity.class);
        startActivity(moveIntent);
    };
}
