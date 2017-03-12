package com.example.codept.auth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static Button btn1;
    private static Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.button);
        openLogin();
        btn2=(Button)findViewById(R.id.button2);
        openRegistration();
    }

    public void openLogin(){
        btn1.setOnClickListener(
            new View.OnClickListener(){
                public void onClick(View v){
                    Intent intent=new Intent("com.example.codept.auth.Login");
                    startActivity(intent);
                }
            }
        );
    }

    public void openRegistration(){
        btn2.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        Intent intent2=new Intent("com.example.codept.auth.Registration");
                        startActivity(intent2);
                    }
                }
        );
    }
}
