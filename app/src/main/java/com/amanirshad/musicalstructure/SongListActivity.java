package com.amanirshad.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SongListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Music Library");
        setContentView(R.layout.activity_song_list);
        ArrayList<Song> songArrayList = new ArrayList<Song>();

        Song s = new Song("Tum hi Ho","Arijit Singh");
        songArrayList.add(s);

        songArrayList.add(new Song("Tera Suroor","Himesh Reshamiya"));
        songArrayList.add(new Song("Rap God","EMINEM"));
        songArrayList.add(new Song("Genda Phool","Badshah"));
        songArrayList.add(new Song("Mai Wahi Hoon","Raftaar"));
        songArrayList.add(new Song("#Sadak","Emiway Bantai ft. Raftaar"));
        songArrayList.add(new Song("Samajh mei aaya kya","Emiway Bantai"));
        songArrayList.add(new Song("Leave out all the rest","Linkin Park"));
        songArrayList.add(new Song("Castle of glass","Linkin Park"));
        songArrayList.add(new Song("Turn Down for what","DJ Snake"));
        songArrayList.add(new Song("Baby","Justin Bieber"));
        songArrayList.add(new Song("Love me like you do","Elie Goudling"));
        songArrayList.add(new Song("Attention","Charlie puth"));
        songArrayList.add(new Song("Dusk till Dawn","Zyan Malik"));
        songArrayList.add(new Song("Malang","Ved Sharma"));
        songArrayList.add(new Song("Blue Eyes","Yo Yo Honey Singh"));
        songArrayList.add(new Song("Dil Mera Blast","Darshan Rava;"));

        SongAdapter songAdapter = new SongAdapter(this,songArrayList);
        ListView songListView = findViewById(R.id.song_list);
        songListView.setAdapter(songAdapter);

        songListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Song song = (Song) adapterView.getItemAtPosition(position);
                Intent intent = new Intent(SongListActivity.this, SongPlayingActivity.class);
                intent.putExtra("SONG_NAME", song.getSongName());
                intent.putExtra("ARTIST_NAME", song.getArtistName());
                startActivity(intent);
            }
        });


    }
}
