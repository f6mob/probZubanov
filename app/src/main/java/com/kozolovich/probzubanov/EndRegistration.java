package com.kozolovich.probzubanov;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EndRegistration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_registration);




    }

    public void registration(View view) {
        Intent i = new Intent(this, home.class);
        startActivity(i);
    }
}