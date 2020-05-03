package com.amanirshad.musicalstructure;

/**
 {@Link Song} Song represents a music with Song name and its artist
 */
public class Song {
    /*Song name for the music*/
    private String mSongName;

    /*Artist name for the music*/
    private String mArtistName;

    /**
    @param songName Song name for the song
     @param artistName Artist name for the song
     */
    public Song(String songName, String artistName){
            mSongName = songName;
            mArtistName = artistName;
    }

    /**
     *
     * @return Artist name of the music
     */
    public String getArtistName() {
        return mArtistName;
    }

    /**
     *
     * @return Song name of the music
     */
    public String getSongName() {
        return mSongName;
    }
}
