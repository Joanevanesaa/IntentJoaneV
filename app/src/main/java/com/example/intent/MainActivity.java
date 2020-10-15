package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText edNama,edInstitusi;
    Button butPindahDenganData, butPindahTanpaData;

    public static final String EXTRA_NAMA = "extra_age";
    public static final String EXTRA_INSTITUSI = "extra_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edNama = findViewById(R.id.nama);
        edInstitusi = findViewById(R.id.institusi);

        butPindahDenganData = findViewById(R.id.pindah_data);
        butPindahTanpaData = findViewById(R.id.pindah_tanpa_data);

        butPindahTanpaData.setOnClickListener(this);
        butPindahDenganData.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        switch (view.getId()) {
            case R.id.pindah_data:
                pindahActivityData();
                break;
            case R.id.pindah_tanpa_data:
                pindahActivityTanpaData();
                break;
            default:
                break;
        }
    }
    private void pindahActivityTanpaData() {
        Intent moveIntent = new Intent (MainActivity.this, SecondActivity.class);
        startActivity(moveIntent);
    }
    private void pindahActivityData() {
        String nama = edNama.getText().toString().trim();
        String institusi = edInstitusi.getText().toString().trim();
        Intent moveIntentWithData = new Intent (MainActivity.this, SecondActivity.class);

        moveIntentWithData.putExtra(this.EXTRA_NAMA,nama);
        moveIntentWithData.putExtra(this.EXTRA_INSTITUSI,institusi);

        startActivity(moveIntentWithData);

    }
}