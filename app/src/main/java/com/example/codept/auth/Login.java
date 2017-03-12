package com.example.codept.auth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    private static EditText user;
    private static EditText pass;
    private static Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(){
        user=(EditText)findViewById(R.id.editText1);
        pass=(EditText)findViewById(R.id.editText2);
        submit=(Button)findViewById(R.id.button3);
        submit.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        if(user.getText().toString()=="admin" && pass.getText().toString()=="admin")
                            Toast.makeText(Login.this,"Correct",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(Login.this,"Incorrect",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }
}
