package com.amanirshad.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SongPlayingActivity extends AppCompatActivity {
    TextView playingSong, playingArtist;
    String songName, artistName;
    Button libraryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Currently Playing");
        setContentView(R.layout.activity_song_playing);
        Intent intent = getIntent();
        playingSong = findViewById(R.id.playing_song);
        playingArtist = findViewById(R.id.playing_artist);
        libraryButton = findViewById(R.id.library_button);

        songName = intent.getStringExtra("SONG_NAME");
        artistName = intent.getStringExtra("ARTIST_NAME");
        playingSong.setText("Song Name: " + songName);
        playingArtist.setText("Artist Name: " + artistName);

        libraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent libraryIntent = new Intent(SongPlayingActivity.this, SongListActivity.class);
                startActivity(libraryIntent);
            }
        });

    }
}
