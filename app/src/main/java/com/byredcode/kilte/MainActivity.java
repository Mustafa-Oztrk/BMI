package com.byredcode.kilte;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText Editkilo, EditBoy;
    TextView sonucText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Editkilo = findViewById(R.id.kilo);
        EditBoy = findViewById(R.id.boy);
        sonucText = findViewById(R.id.sonuc);
    }

    public void hesapla(View view){
        double kilosonuc= Integer.parseInt(Editkilo.getText().toString());
        double boysonuc = Integer.parseInt(EditBoy.getText().toString());
        boysonuc = boysonuc/100;

        double sonucs = kilosonuc / (boysonuc *boysonuc) ;


        if (sonucs < 18 ){
            sonucText.setText("Sonuç :"+ String.format( "%.2f", sonucs )+" Zayıfsınız" );
        } else if (sonucs >= 18 && sonucs <25 ) {
            sonucText.setText("Sonuç : "+  String.format( "%.2f", sonucs ) + " Normalsiniz" );
        } else if (sonucs>=25 && sonucs < 30) {

            sonucText.setText("Sonuç : " + String.format("%.2f", sonucs) + " Kilolusunuz");
        } else if (sonucs>= 30 && sonucs<35) {
            sonucText.setText("Sonuç : " + String.format("%.2f", sonucs ) + " 1. Derece Obezsiniz ");
        } else if (sonucs>= 25 && sonucs<40) {
            sonucText.setText("Sonuç : " + String.format("%.2f", sonucs) + " 2. Derece Obezsiniz");
        }else {
            sonucText.setText("Sonuç : " + String.format("%.2f",sonucs) + " 3. Derece Obezsiniz");
        }



        System.out.println("Sonuc " +sonucs );

    }
}