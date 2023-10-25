import java.util.ArrayList;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        Song song1 = new Song("taweel el shawq", 2.5);
        Song song2 = new Song("song2", 3.0);
        Song song3 = new Song("song3", 4.2);

        Album album = new Album("My Album", "Artist", new ArrayList<>());
        album.addSong(song1.getSongName(), String.valueOf(song1.getSongDuration()));
        album.addSong(song2.getSongName(), String.valueOf(song2.getSongDuration()));
        album.addSong(song3.getSongName(), String.valueOf(song3.getSongDuration()));

        PlayList playlist = new PlayList();
        playlist.addToPlayList(song1);
        playlist.addToPlayList(song2);

        playlist.addToPlayList(song3);

        playlist.printPlaylist();

        playlist.removeFromPlayList(song3);

        playlist.printPlaylist();

         playlist.removeFromPlayList(song3);

        playlist.printPlaylist();
    }
}
