package com.example.appharrypotter;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class Home2 extends AppCompatActivity {

    ImageButton btnTeste, btnWallpaper1, btnFeitico, btnMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        btnTeste = findViewById(R.id.btnTeste2);
        btnWallpaper1 = findViewById(R.id.btnWallpaper1);
        btnFeitico = findViewById(R.id.btnFeitico2);
        btnMain = findViewById(R.id.btnMain2);
    }
    public void openTeste(View view) {
        Intent intent = new Intent(this, Quiz.class);
        startActivity(intent);
    }
    public void openWallpaper(View view) {
        Intent intent = new Intent(this, Wallpaper.class);
        startActivity(intent);
    }

    public void openFeitico(View view) {
        Intent intent = new Intent(this, TelaFeiticos.class);
        startActivity(intent);
    }

    public void openMain(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void Trailer (View view) {
        Uri uri = Uri.parse("https://youtu.be/9fIObnIGMlI");
        Intent trailer = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/9fIObnIGMlI"));
        startActivity(trailer);
    }

    public void Pesquisa (View view){
        Intent pesquisa = new Intent(Intent.ACTION_WEB_SEARCH);
        String query = "Elenco de Harry Potter";
        pesquisa.putExtra(SearchManager.QUERY, query);
        startActivity(pesquisa);
    }

    public void verMapa(View view)
    {
        //coordenadas, onde geo:latitude,longitude; z = o n??vel de zoom
        Uri location = Uri.parse("geo:-33.0360972,-97.4180556,11z");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        startActivity(mapIntent);

    }

    public void Email(View view) throws UnsupportedEncodingException {

        //formata o conte??do do email
        String uriText =
                "mailto:yasmimborgesdias@gmail.com" +
                        "?subject=" + URLEncoder.encode("Voldemort est?? de volta, ajude-nos!", "utf-8") +

                        "&body=" + URLEncoder.encode("Tom Riddle recuperou seu corpo f??sico:???", "utf-8");
        Uri uri = Uri.parse(uriText);
        //inicia a Intent
        Intent email = new Intent(Intent.ACTION_SENDTO);
        //Define o conte??do
        email.setData(uri);
        //Inicia a activity para enviar o email
        startActivity(email);

    }

}