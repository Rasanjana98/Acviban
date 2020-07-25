package com.rasanjana.miniprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstName=findViewById(R.id.firstName);
        lastName=findViewById(R.id.lastName);
        email=findViewById(R.id.email);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                void checkDataEntered();{
                    boolean isEmpty(EditText text);{
                        CharSequence str= text.getText().toString();
                       // return TextUtils.isEmpty(str);
                    }
                }
            }

        });
    }
    EditText firstName;
    EditText lastName;
    EditText email;
    Button register;

}