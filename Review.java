public class Review {
    private String name ;
    private int rating ;
    private String comment ;





    Review(String name , int rating , String comment){
        this.comment = comment ;
        this.name = name ;
        this.rating = rating ;


    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }






}
