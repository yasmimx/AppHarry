package com.example.appharrypotter;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity {

    EditText username, password;
    Button crie, entre;
    Button btnlogin;
    DBhelper DB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        username = (EditText) findViewById(R.id.username1);
        password = (EditText)  findViewById(R.id.password1);
        btnlogin = (Button) findViewById(R.id.btnsingup1);
        crie = (Button) findViewById(R.id.btnsingin1);
        entre = (Button) findViewById(R.id.btnsingup1);

        DB = new DBhelper(this);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String user = username.getText().toString();
                String pass = password.getText().toString();

                if(user.equals("") || pass.equals(""))
                    Toast.makeText(login.this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
                else{
                    Boolean checkuserpass = DB.checkusernamepassword(user, pass);
                    if(checkuserpass == true){
                        Toast.makeText(login.this, "Logado com sucesso", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent (getApplicationContext(), MainActivity.class);
                        startActivity(intent);

                    }else {
                        Toast.makeText(login.this, "Credenciais Invalidas", Toast.LENGTH_SHORT).show();
                    }
                }


            }
        });

        crie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login.this, Cadastro.class);
                startActivity(intent);
            }

        });

    }
}
