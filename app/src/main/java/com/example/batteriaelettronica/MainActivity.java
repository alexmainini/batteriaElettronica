package com.example.batteriaelettronica;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void btnCassaDestra(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.cassa_destra);
        mediaPlayer.start();
    }

    public void btnCassaSinistra(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.cassa_sinistra);
        mediaPlayer.start();
    }

    public void btnRullanteDestra(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.rullante_destro);
        mediaPlayer.start();
    }

    public void btnRullanteSinistra(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.rullante_sinistro);
        mediaPlayer.start();
    }

    public void btnClaves(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.claves);
        mediaPlayer.start();
    }

    public void btnCharlestone(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.charleston);
        mediaPlayer.start();
    }

    public void btnPiatto(View view) {
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.piatto);
        mediaPlayer.start();
    }
}