package com.example.firstapp1;

import static android.graphics.Color.GREEN;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.text.method.LinkMovementMethod;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.graphics.Color;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button btn;
    RadioButton reg;
    RadioGroup radioGroup;
    RadioButton reg1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);
        radioGroup = findViewById(R.id.rg);
        reg = findViewById(R.id.reg);
        reg1 = findViewById(R.id.sign);
        textView = (TextView) findViewById(R.id.skip);
        textView.setLinkTextColor(Color.rgb(18, 77, 70));
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i)
                {
                    case    R.id.reg:
                        Intent  intent  =   new Intent(getApplicationContext(), RegisterPage.class);
                        startActivity(intent);
                        break;
                    case    R.id.sign:
                        Intent  intnt  =   new Intent(getApplicationContext(), SigninPage.class);
                        startActivity(intnt);
                        break;

                }
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  intent  =   new Intent(getApplicationContext(), MainPageFlight.class);
                startActivity(intent);
            }
        });
    }


}


