package com.amanirshad.musicalstructure;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(@NonNull Context context,  @NonNull List<Song> songList) {
        super(context, 0, songList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View songListView = convertView;
        if(songListView ==null){
                songListView = LayoutInflater.from(getContext()).inflate(R.layout.song_item,parent,false);
        }

        Song currentSong =getItem(position);

        TextView songName =(TextView)songListView.findViewById(R.id.song_name);
        songName.setText(currentSong.getSongName());

        TextView artistName = (TextView)songListView.findViewById(R.id.artist_name);
        artistName.setText(currentSong.getArtistName());

        return songListView;
    }
}
