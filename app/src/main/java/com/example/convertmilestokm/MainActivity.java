package com.example.convertmilestokm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonconvtoKM = (Button) findViewById(R.id.buttonconvtoKM);
        buttonconvtoKM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textboxmiles = (EditText) findViewById(R.id.editTextMiles);
                EditText textboxKM = (EditText) findViewById(R.id.editTextKM);
                double vmiles = Double.valueOf(textboxmiles.getText().toString());
                double vkm = vmiles/0.62137;
                DecimalFormat formatval = new DecimalFormat("##.##");
                textboxKM.setText(formatval.format(vkm));
            }
        });

        Button buttonconvtomil = (Button) findViewById(R.id.buttonconvtomil);
        buttonconvtomil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textboxKM = (EditText) findViewById(R.id.editTextKM);
                EditText textboxMiles = (EditText) findViewById(R.id.editTextMiles);
                double vkm = Double.valueOf(textboxKM.getText().toString());
                double vmiles = vkm*0.62137;
                DecimalFormat formatval = new DecimalFormat("##.##");
                textboxMiles.setText(formatval.format(vmiles));
            }
        });
    }
}
