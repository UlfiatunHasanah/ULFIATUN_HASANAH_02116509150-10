package com.ulfiatunhasanah.catatanku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class InsertViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_view);

        setTitle("Catatan Baru");
    }

    public void actionSumbitNote(View view) {
        //aksi setelah submit
        //melakukan koneksi internet
        //penyimpanan file
    }
}