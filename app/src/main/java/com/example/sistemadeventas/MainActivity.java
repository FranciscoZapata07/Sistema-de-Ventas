package com.example.sistemadeventas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.firestore.FirebaseFirestore;

public class MainActivity extends AppCompatActivity {
    //Se genera un objeto para conectarse a la base de datos de Fissrebase-Firestore
    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}