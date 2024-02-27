import java.util.List;

public class AcademicBook extends Book{

    private String subject ;

    AcademicBook(String title, String auteur, String isbn, double price, int stock, List<Review> reviews , String subject) {
        super(title, auteur, isbn, price, stock, reviews);

        this.subject = subject ;

    }


    @Override
    public String getMediaType() {
        return isBesteSeller() ? "Best Selling Academic Book " : "AcademicBook" ;
    }


    @Override
    public String toString() {
        return "AcademicBook{" +
                "subject='" + subject + '\'' +
                '}';
    }
}
