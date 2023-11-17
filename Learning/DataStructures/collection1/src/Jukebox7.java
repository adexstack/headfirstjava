import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Jukebox7 {
    public static void main(String[] args) {
        new Jukebox7().go();
    }

    private void go() {
        List<SongV4> songList = MockMoreSongs.getSongsV4(SongV4::toStringTitleArtist);

        // unsorted songList
        System.out.println(songList);
        System.out.println("-".repeat(30));

        // sorted by title (using Lambda)
        songList.sort((one,two) -> one.getTitle().compareTo(two.getTitle()));
        System.out.println(songList);

        // sorted by artist name (using Lambda) (HeadFirstJava)
        songList.sort((one, two) -> one.getArtist().compareTo(two.getArtist()));

        // Expanding the parameter (using lambda more explicit) (self)
        //songList.sort((SongV3 one, SongV3 two) -> one.getArtist().compareTo(two.getArtist()));

        // Using Comparator.comparing (self)
        //songList.sort(Comparator.comparing(SongV3::getArtist));

        System.out.println(songList);
    }
}

class MockMoreSongs {

    public static List<SongV4> getSongsV4(Function<SongV4, String> toStringFct) {
        List<SongV4> songs = new ArrayList<>();
        songs.add(new SongV4("somersault", "zero 7", 147, toStringFct));
        songs.add(new SongV4("cassidy", "grateful dead", 158, toStringFct));
        songs.add(new SongV4("$10", "hitchhiker", 140, toStringFct));
        songs.add(new SongV4("havana", "cabello", 105, toStringFct));
        songs.add(new SongV4("$10", "hitchhiker", 140, toStringFct));
        songs.add(new SongV4("Cassidy", "grateful dead", 158, toStringFct));
        songs.add(new SongV4("50 ways", "simon", 102, toStringFct));
        return songs;
    }


}

class SongV4 {
    private String title;
    private String artist;
    private int bpm;
    private Function<SongV4, String> toStringFct;

    SongV4(String title, String artist, int bpm, Function<SongV4, String> toStringFct) {
        this.title = title;
        this.artist = artist;
        this.bpm = bpm;
        this.toStringFct = toStringFct;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getBpm() {
        return bpm;
    }

    public String toString() {
        return toStringFct.apply(this);
    }

    public static String toStringTitleArtist(SongV4 o) {
        return o.title + ": " + o.artist;
    }

    public static String toStringTitle(SongV4 o) {
        return o.title;
    }

    @Override
    public boolean equals(Object aSong) {
        SongV4 other = (SongV4) aSong;
        return title.equals(other.getTitle());
    }

    @Override
    public int hashCode() {
        return title.hashCode();
    }

}
