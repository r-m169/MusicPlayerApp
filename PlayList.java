import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class PlayList {

    private LinkedList<Song> songs;

    public PlayList() {
        this.songs = new LinkedList<>();
    }

    public void addToPlayList(Song song) {
        songs.add(song);
        System.out.println(song.getSongName() + "added to the playList");
    }

    public void removeFromPlayList(Song song) {
        boolean removed = songs.remove(song);
        if (removed) {
            System.out.println(song.getSongName() + "removed from the playList");
        } else {
            System.out.println(song.getSongName() + " doesn't exist");

        }
    }

    public void printPlaylist() {
        System.out.println("Playlist:");
        getSongsFromThePlayList();
    }

    public void getSongsFromThePlayList() {
        for (int i = 0; i < songs.size(); i++) {
            Song song = songs.get(i);
            System.out.println((i + 1) + ". " + song);
        }
    }

}