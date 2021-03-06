package com.example.android.studikasus1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private TextView tempat;
    private TextView menu;
    private TextView jumlah;
    private TextView harga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();

        String tempat_makan = intent.getStringExtra("tempat_makan");
        String menu_makan = intent.getStringExtra("menu_makan");
        String jumlah_porsi = intent.getStringExtra("jumlah_porsi");
        String harga_makan = intent.getStringExtra("harga");
        int hrg = Integer.valueOf(harga_makan)*Integer.valueOf(jumlah_porsi);

        tempat = (TextView) findViewById(R.id.tempatMakan);
        tempat.setText(tempat_makan);

        menu = (TextView) findViewById(R.id.menu2);
        menu.setText(menu_makan);

        jumlah = (TextView) findViewById(R.id.porsi2);
        jumlah.setText(jumlah_porsi);

        harga = (TextView) findViewById(R.id.harga2);
        harga.setText(String.valueOf(hrg));

        if(hrg > 65000){
            Toast toast = Toast.makeText(this, "Jangan disini makan malamnya, uang kamu tidak cukup", Toast.LENGTH_LONG);
            toast.show();
        } else {
            Toast toast = Toast.makeText(this, "Disini aja makan malamnya", Toast.LENGTH_LONG);
            toast.show();
        }
    }
}
