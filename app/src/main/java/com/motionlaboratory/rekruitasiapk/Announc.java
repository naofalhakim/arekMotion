package com.motionlaboratory.rekruitasiapk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Announc extends AppCompatActivity {

    TextView txtNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_announc);
        txtNama = (TextView)findViewById(R.id.txtNama);

        Intent i = getIntent();
        txtNama.setText( i.getStringExtra("Nama") );
    }
}
