package com.example.baitap_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Profile extends AppCompatActivity {
TextView edtName1,edtPass1;
Button btnHuy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        addControl();
        Bundle bundle=getIntent().getExtras();
        String username=bundle.getString("username");
        String password=bundle.getString("password");
        edtName1.setText(username);
        edtPass1.setText(password);
        btnHuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    public void addControl(){
        edtName1=findViewById(R.id.edtName1);
        edtPass1=findViewById(R.id.edtPass1);
        btnHuy=findViewById(R.id.btnHuy);
    }
}