package com.pendka.frenchteacherapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button blackBtn, greenBtn, purpleBtn, redBtn, yellowBtn;

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

        blackBtn = findViewById(R.id.blackBtn);
        greenBtn = findViewById(R.id.greenBtn);
        purpleBtn = findViewById(R.id.purpleBtn);
        redBtn = findViewById(R.id.redBtn);
        yellowBtn = findViewById(R.id.yellowBtn);

        blackBtn.setOnClickListener(this);
        greenBtn.setOnClickListener(this);
        purpleBtn.setOnClickListener(this);
        redBtn.setOnClickListener(this);
        yellowBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int clickedButtonId = v.getId();

        if(clickedButtonId == R.id.blackBtn){
            MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.black);
            mediaPlayer.start();
        } else if (clickedButtonId == R.id.greenBtn) {
            MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.green);
            mediaPlayer.start();
        } else if (clickedButtonId == R.id.purpleBtn) {
            MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.purple);
            mediaPlayer.start();
        } else if (clickedButtonId == R.id.redBtn) {
            MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.red);
            mediaPlayer.start();
        }else if (clickedButtonId == R.id.yellowBtn) {
            MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.yellow);
            mediaPlayer.start();
        }
    }
}