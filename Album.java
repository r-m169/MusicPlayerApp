import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String nameOfTheAlbum;
    private String artistOfTheAlbum;
    private ArrayList<Song> songs;

    public Album() {

    }

    public Album(String albumName, String albumArtist, ArrayList<Song> songs) {
        this.nameOfTheAlbum = albumName;
        this.artistOfTheAlbum = albumArtist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String songName, String songDuration) {
        if (findSong(songName) == null) {
            songs.add(new Song("taweel el shawq", 2.5));
            return true;
        } else {
            System.out.println("Song with name" + songName + "is already exist");
            return false;
        }
    }

    public Song findSong(String title) {
        for (Song checkedSong : songs) {
            if (ischeckedSongHere(checkedSong, title))
                return checkedSong;
        }
        return null;
    }

    public boolean ischeckedSongHere(Song checkedSong, String title) {
        return checkedSong.getSongName().equals(title);
    }

   
}