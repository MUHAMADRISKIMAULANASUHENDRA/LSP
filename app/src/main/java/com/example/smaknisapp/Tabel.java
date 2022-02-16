package com.example.smaknisapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;

public class Tabel extends AppCompatActivity {

    private boolean tabelku = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabel);
    }
    public void ciutkanTabel(View view){

        TableLayout table = findViewById(R.id.tabel);
        Button Button = findViewById(R.id.Button);

        table.setColumnCollapsed(1, tabelku);
        table.setColumnCollapsed(2, tabelku);

        if (tabelku){
            tabelku = false;
            Button.setText("Tunjukkan detail");
        }else {
            tabelku = true;
            Button.setText("Detail tersembunyi");
        }
    }
}

