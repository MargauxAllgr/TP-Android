package com.example.tp2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import java.util.ArrayList;

import modele.Etudiant;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnAddEtudiant = findViewById(R.id.btnAddEtudiant);
        btnAddEtudiant.setOnClickListener(this);
        Button btnListEtudiants = findViewById(R.id.btnListEtudiants);
        btnListEtudiants.setOnClickListener(this);
        Button btnEvalApp = findViewById(R.id.btnEvalApp);
        btnEvalApp.setOnClickListener(this);
        Button btnStat = findViewById(R.id.btnStat);
        btnStat.setOnClickListener(this);
    }

    public void onClick(View v){
        switch(v.getId()){
            case R.id.btnAddEtudiant :
                Log.d("Test switch","Add modele.Etudiant");
                Intent monIntent2 = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(monIntent2);
                break;
            case R.id.btnListEtudiants :
                Log.d("Test switch","Liste Etudiants");
                Intent monIntent3 = new Intent(MainActivity.this,Main3Activity.class);
                startActivity(monIntent3);
                break;
            case R.id.btnEvalApp:
                Log.d("Test switch","Evaluer app");
                Intent monIntent4 = new Intent(MainActivity.this,Main4Activity.class);
                startActivity(monIntent4);
                break;
            case R.id.btnStat:
                Log.d("Test switch","stat");
                Intent monIntent5 = new Intent(MainActivity.this,Main5Activity.class);
                startActivity(monIntent5);
                break;

            default:
                Log.d("Test switch","autre");
                throw new IllegalStateException("Unexpected value: " + v);
        }
    }
}
