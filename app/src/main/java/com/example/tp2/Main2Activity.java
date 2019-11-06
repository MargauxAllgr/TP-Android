package com.example.tp2;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import modele.Etudiant;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button btnAnnuler = findViewById(R.id.btnAnnuler);
        btnAnnuler.setOnClickListener(this);
        Button btnEnregistrer = findViewById(R.id.btnEnregistrer);
        btnEnregistrer.setOnClickListener(this);

    }

    public void onClick(View v){
        switch(v.getId()){
            case R.id.btnAnnuler :
                //pk pas rajouter un toast
                Snackbar.make(v, "Opération annulée", Snackbar.LENGTH_LONG);
                finish();
                break;
            case R.id.btnEnregistrer :
                EditText etNom = findViewById(R.id.etNom);
                EditText etPrenom = findViewById(R.id.etPrenom);
                MonApplication.getListeEtudiants().add(new Etudiant(etNom.getText().toString(),etPrenom.getText().toString(),'s',""));
                break;

            default:
                Log.d("Test switch","autre");
                throw new IllegalStateException("Unexpected value: " + v);
        }
    }

}
