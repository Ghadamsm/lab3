import java.util.ArrayList;
import java.util.List;

public class Movie extends Media{



    private int duration ;


    Movie(String title, String auteur, String isbn, double price , int duration) {
        super(title, auteur, isbn, price);


        this.duration = duration ;
    }



    public void watch (User user){
        user.addToCart(this);

    }



    public List<Movie> recommendSimilarMovies(List<Movie>movieCatalog){
        List<Movie> recommendedMovies = new ArrayList<>();
        for (Movie movie : movieCatalog ){
            if (movie.getAuteur().equals(getAuteur()) && ! movie.getTitle().equals(getTitle() )) {

                recommendedMovies.add(movie);
            }
        }

        return recommendedMovies ;
    }


    @Override
    public String getMediaType() {
        return (duration >= 120 ) ? "Long Movie " : "Movie";
    }


    @Override
    public String toString() {
        return super.toString() + " - Type : " + getMediaType();
    }


}
