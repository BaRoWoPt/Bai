package com.example.baitap_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {
EditText txtName,txtPass;
Button btnOk,btnCancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        addControl();
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username=txtName.getText().toString().trim();
                String password=txtPass.getText().toString().trim();
                Intent intent=new Intent(Login.this, Profile.class);
                intent.putExtra("username",username);
                intent.putExtra("password",password);
                startActivity(intent);
            }
        });
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    public void addControl(){
        txtName=findViewById(R.id.txtName);
        txtPass=findViewById(R.id.txtPass);
        btnOk=findViewById(R.id.btnOk);
        btnCancel=findViewById(R.id.btnCancel);
    }
}