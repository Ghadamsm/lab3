import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Music extends Media {

    private String artist ;

    Music(String title, String auteur, String isbn, double price , String artist) {
        super(title, auteur, isbn, price);

        this.artist = artist ;

    }


    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }



    public void listen (User user){
        user.addToPurchasedMedia(this);

    }




    public List<Music>GeneratePlaylist (List<Music> musicCatalog){
        List<Music> playList = new ArrayList<>();
        for (Music music : musicCatalog ){
            if (music.getAuteur().equals(getAuteur()) && !music.getTitle().equals(getTitle())) {
                playList.add(music);
            }
        }

        return musicCatalog ;
    }






    @Override
    public String getMediaType() {
        return (getPrice() >= 10 ) ? "Premium Music" : "Music";
    }


    @Override
    public String toString() {
        return super.toString() + " - Type : " + getMediaType();
    }
}
