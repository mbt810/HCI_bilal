package com.bilal.test;

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
        final EditText em,pass;
        Button login;
        em=findViewById(R.id.email);
        pass=findViewById(R.id.pass);
        login=findViewById(R.id.login);
        String email=em.getText().toString();

        if(em.getText().toString().equals("Bilal")&& pass.getText().toString().equals("Bilal"))
        {
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, form.class);
                intent.putExtra("login",em.getText().toString());
                startActivity(intent);
            }
        });

        }

    }
}
