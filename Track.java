import java.util.Date;

public class Track {
    private String title;
    private int trackID;
    private String album;
    private Artist artist;
    private Date length;
    private String album_default = "unknown";


    public Track (String title, Artist artist, Date length, String album) {
        this.title = title;
        this.artist = artist;
        this.length = length;
        this.album = album;
    }

    public Track (String title, Artist artist, Date length) {
        this.title = title;
        this.artist = artist;
        this.length = length;
        this.album = album_default;
    }



    public String getTitle() {
        return title;
    }

    public String getAlbum() {
        return album;
    }

    public Artist getNameArtist() {
        return artist.name;
    }

    public Date getLength() {
        return length;
    }

    public void setTrackID(int trackID) {
        this.trackID = trackID;
    }


    public void setAlbum(String album) {
        this.album = album;
    }

    public void  setNameArtist () {

    }


    public void setTitle(String title) {
        this.title = title;
    }
    public int getTrackID() {
        return trackID;
    }

}
