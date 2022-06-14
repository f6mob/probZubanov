package com.kozolovich.probzubanov;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }



    public void registration(View view) {
        EditText editTextTextEmailAddress = (EditText) findViewById(R.id.editTextTextEmailAddress);
        String mail = editTextTextEmailAddress.getText().toString();
        if (mail.matches("")) {
            Toast.makeText(this, " Почта не указана", Toast.LENGTH_SHORT).show();
            return;
        }
        EditText editTextTextPassword = (EditText) findViewById(R.id.editTextTextPassword);
        String password = editTextTextPassword.getText().toString();
        if (password.matches("")) {
            Toast.makeText(this, "Пароль не указан", Toast.LENGTH_SHORT).show();
        return;
        }


        Intent i = new Intent(this, EndRegistration.class);
        startActivity(i);
    }
}