package com.example.appharrypotter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RadioButton;

public class Quiz2 extends AppCompatActivity {

    RadioButton yes1, yes2, yes3, no1, no2, no3;
    Button find;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // Elementos pelo ID
        yes1 = findViewById(R.id.btnYes1);
        yes2 = findViewById(R.id.btnYes2);
        yes3 = findViewById(R.id.btnYes3);
        no1 = findViewById(R.id.btnNo1);
        no2 = findViewById(R.id.btnNo2);
        no3 = findViewById(R.id.btnNo3);
        find = findViewById(R.id.btnFind);

    }

    // Botão Descubra
    public void answerQuiz(View view) {
        // Condições para determinar qual intent abrir
        if (yes1.isChecked() == true && yes2.isChecked() == true && yes3.isChecked() == true) {
            // Abre uma intent implícita
            Uri uri = Uri.parse("https://harrypotter.fandom.com/pt-br/wiki/Cervo");
            Intent it = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(Intent.createChooser(it, getString(R.string.chNavegador)));
        } else if (no1.isChecked() == true && no2.isChecked() == true && no3.isChecked() == true) {
            Uri uri = Uri.parse("https://harrypotter.fandom.com/pt-br/wiki/Raposa");
            Intent it = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(Intent.createChooser(it, getString(R.string.chNavegador)));
        } else if (yes1.isChecked() == true && no2.isChecked() == true && no3.isChecked() == true) {
            Uri uri = Uri.parse("https://harrypotter.fandom.com/pt-br/wiki/Cavalo");
            Intent it = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(Intent.createChooser(it, getString(R.string.chNavegador)));
        } else if (yes1.isChecked() == true && yes2.isChecked() == true && no3.isChecked() == true) {
            Uri uri = Uri.parse("https://harrypotter.fandom.com/pt-br/wiki/Unic%C3%B3rnio");
            Intent it = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(Intent.createChooser(it, getString(R.string.chNavegador)));
        } else if (no1.isChecked() == true && yes2.isChecked() == true && yes3.isChecked() == true) {
            Uri uri = Uri.parse("https://harrypotter.fandom.com/pt-br/wiki/F%C3%AAnix");
            Intent it = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(Intent.createChooser(it, getString(R.string.chNavegador)));
        } else if (no1.isChecked() == true && no2.isChecked() == true && yes3.isChecked() == true) {
            Uri uri = Uri.parse("https://harrypotter.fandom.com/pt-br/wiki/Hipogrifo");
            Intent it = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(Intent.createChooser(it, getString(R.string.chNavegador)));
        } else if (yes1.isChecked() == true && no2.isChecked() == true && yes3.isChecked() == true) {
            Uri uri = Uri.parse("https://harrypotter.fandom.com/pt-br/wiki/%C3%81guia");
            Intent it = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(Intent.createChooser(it, getString(R.string.chNavegador)));
        } else {
            Uri uri = Uri.parse("https://harrypotter.fandom.com/pt-br/wiki/Gato");
            Intent it = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(Intent.createChooser(it, getString(R.string.chNavegador)));
        }
    }
}