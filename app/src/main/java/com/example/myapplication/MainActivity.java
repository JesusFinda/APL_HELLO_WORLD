package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSend= findViewById(R.id.btn_send);

        btnSend.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                EditText editText = findViewById(R.id.txtInput);

                String textoDaInput = editText.getText().toString();

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("chave1",textoDaInput);
                startActivity(intent);
            }
        });


    }
}