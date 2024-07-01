package com.example.exampleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button, button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // button1= findViewById(R.id.toast);
        //button1.setOnClickListener(this);

        button = (Button) findViewById(R.id.button);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);





        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();

            }
        });


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity3();

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSettingsActivity();

            }
        });
    }






    public void openActivity2() {
        Intent intent  = new Intent (this, Activity2.class);
        startActivity(intent);

    }

    public void openActivity3() {
        Intent intent  = new Intent (this, Activity3.class);
        startActivity(intent);
        Toast.makeText(MainActivity.this, "You have now opened Help page", Toast.LENGTH_LONG).show();
    }

    public void openSettingsActivity() {
        Intent intent  = new Intent (this, SettingsActivity.class);
        startActivity(intent);
        Toast.makeText(MainActivity.this, "Welcome to settings page", Toast.LENGTH_LONG).show();
    }


}