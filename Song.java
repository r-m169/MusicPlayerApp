public class Song {
    private String songName;
    private double songDuration;

    public Song(String songName, double songDuration) {
        this.songName = songName;
        this.songDuration = songDuration;
    }

    public Song() {

    }

    public String getSongName() {
        return songName;
    }

    public double getSongDuration() {
        return songDuration;
    }

    @Override
    public String toString() {
        return "Song{" +
                "Song's name" + " "+songName + '\'' +
                ", duration=" + songDuration +
                '}';
    }
}
