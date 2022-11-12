package com.yusufaktan.catchthespongebob;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void nextPage(View view){
        Intent intent = new Intent(MainMenu.this, MainActivity.class);
        startActivity(intent);
    }

    public void howToPlay(View view){
        AlertDialog.Builder howToPlay = new AlertDialog.Builder(this);
        howToPlay.setTitle("Nasıl Oynanır?");
        howToPlay.setMessage("Süngerbob ekranda sürekli yer değiştirecektir." + "\nSüngerbob'un üstüne tıklayarak skorunuzu arttırmalısınız.");
        howToPlay.setPositiveButton("Hadi Oynayalım!", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        howToPlay.show();
    }

    public void credits(View view){
        AlertDialog.Builder credits = new AlertDialog.Builder(this);
        credits.setTitle("Emeği Geçenler");
        credits.setMessage("Yusuf Aktan" + "\nlinkedin.com/in/yusufaktan"+"\ngithub.com/yusufaktan");
        credits.setPositiveButton("Geri Dön", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        credits.show();
    }
}