package com.example.ryan.ryanfaizalandriyanto_1202154188_modul3;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name, pass;
    Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.nama);
        pass = (EditText) findViewById(R.id.password);
        btnlogin = (Button) findViewById(R.id.btn_login);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usernameKey = name.getText().toString();
                String passwordKey = pass.getText().toString();

                if (usernameKey.equals("EAD") && passwordKey.equals("MOBILE") || usernameKey.equals("admin") && passwordKey.equals("ryan")){
                    Toast.makeText(getApplicationContext(), "Login Sukses...!!",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent (MainActivity.this, Menu.class);
                    startActivity(intent);

                }else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("Username atau Password anda Salah !").setNegativeButton("Retry!", null).create().show();
                }
            }
        });
    }
}
