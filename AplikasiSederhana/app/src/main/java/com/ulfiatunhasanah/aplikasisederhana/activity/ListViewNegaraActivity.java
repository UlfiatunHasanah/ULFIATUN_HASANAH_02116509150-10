package com.ulfiatunhasanah.aplikasisederhana.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.ulfiatunhasanah.aplikasisederhana.R;

public class ListViewNegaraActivity extends AppCompatActivity {

    private ListView lvNegara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_negara);

        setTitle("List View Negara");

        String [] countryArray = new String[]{
                "Indonesia", "Malaysia", "Korea Selatan", "Jepang", "China",
                "Singapura", "Inggris", "Australia", "Amerika", "Perancis", "Kamboja"
        };

        lvNegara = findViewById(R.id.lv_negara);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                countryArray);
        lvNegara.setAdapter(adapter);
        lvNegara.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), countryArray[i], Toast.LENGTH_SHORT).show();
            }
        });
    }
}