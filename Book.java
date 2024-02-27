import java.util.ArrayList;
import java.util.List;

public class Book  extends Media{

    private int stock ;
    private List<Review> reviews ;

    Book(String title, String auteur, String isbn, double price , int stock , List<Review> reviews ) {
        super(title, auteur, isbn, price);

        this.stock = stock ;
        this.reviews = new ArrayList<>();

    }



    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }



    public void addReview(Review r ){
        this.reviews.add(r);

    }


    public double getAverageRating(){
        double sum = 0 ;
        for (Review review : reviews ){
            sum += review.getRating();
        }
        return reviews.size() > 0 ? sum / reviews.size() : 0 ;
    }

    public boolean purchase(User user){
        if (stock > 0 ){
            user.addToCart(this);
            stock -- ;
            return true ;
        }
        return false ;
    }


    public boolean isBesteSeller(){
        return getAverageRating() >= 3.5 ;
    }


    public void restock(int quantity){
        this.stock += quantity ;
        System.out.println("Book restocked , new quantity : " + stock);
    }


    @Override
    public String getMediaType() {
        return isBesteSeller() ? "Bestselling Book " : "Book " ;
    }


    @Override
    public String toString() {
        return super.toString() + " - Type : " + getMediaType();
    }


}
