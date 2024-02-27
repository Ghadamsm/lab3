import java.util.List;

public class Novel extends Book{

    private String genre ;



    Novel(String title, String auteur, String isbn, double price, int stock, List<Review> reviews , String genre) {
        super(title, auteur, isbn, price, stock, reviews);

        this.genre = genre ;

    }





    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


    @Override
    public String getMediaType() {
        return isBesteSeller() ? "Best Selling Novel " : "Novel" ;
    }


    @Override
    public String toString() {
        return "Novel{" +
                "genre='" + genre + '\'' +
                '}';
    }


}
