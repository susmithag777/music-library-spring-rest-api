// Write your code here
package com.example.song;
import java.util.*;

public interface SongRepository {
    ArrayList<Song> getSong();
    Song addSong(Song song);
    Song getSongById(int songId);
    Song updateSong(int songId,Song song);

    void deleteSong(int songId);

}