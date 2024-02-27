import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);




        Store s1 = new Store(new ArrayList<User>() , new ArrayList<Media>());
        User user = new User(new ArrayList<Media>() , new ArrayList<Media>());







//        users

        User u1 = new User("ghada mohammad" , "ghada@gmail.com" );
        User u2 = new User("mohammad" , "mo@gmail.com");
        User u3 = new User("shaden" , "shad@gmail.com");





//        Add Review


        Review R1N = new Review("latiffah" , 4 , "Good Book !");
        Review R2N = new Review("naif" , 5 , "Good Book !");
        Review R3N = new Review("asma" , 2 , "bad !");


        Review R1A = new Review("rakan" , 1 , "so bad");
        Review R2A = new Review("anfal" , 2 , "bad");
        Review R3A = new Review("noura" , 4 , "good");


        Review R1MU = new Review("anas" , 3 , "not bad");
        Review R2MU = new Review("manar" , 4 , "good");
        Review R3MU = new Review("sarah" , 5 , "soo good !");


        Review R1MO = new Review("foz" , 0 , "bad");
        Review R2MO = new Review("dana" , 5 , "good");
        Review R3MO = new Review("leena" , 2 , "bad");





//        Music

        Music mu1 = new Music("لا يروح الليل" ,  "احلام" , "199288374" , 22 , "احلام" ) ;
        Music mu2 = new Music("اجيلك شوق" ,"ذكرى" , "553462883" , 8,"ذكرى" ) ;
        Music mu3 = new Music("Bleeding" , "TalkinToys" , "773654774" , 23 , "TalkinToys") ;


//      Movie


        Movie mo1 = new Movie("movie 1" , "anas" , "735528939" , 10 , 100 ) ;
        Movie mo2 = new Movie("movie 2" , "dalal" , "332467754" , 15 , 110 ) ;
        Movie mo3 = new Movie("movie 3" , "nada" , "7366554785" , 22 , 120 ) ;



//        Books


        AcademicBook ac1 = new AcademicBook("academic 1 " , "sadeem" , "66524473" , 50 , 10 , new ArrayList<Review>() , "Spring Boot");
        AcademicBook ac2 = new AcademicBook("academic 2" , "monerh" , "766228675" , 49 , 8 , new ArrayList<Review>() , "SQL" );
        AcademicBook ac3 = new AcademicBook("academic 3" , "roz" , "1988237645" , 3 , 1 , new ArrayList<Review>() , "HTML" );


        Novel N1 = new Novel("novel 1" , "maha" , "9937746658" , 30 , 2 , new ArrayList<Review>() , "fantasy");
        Novel N2 = new Novel("novel 2" , "aseel" , "2299338847" , 32 , 8 , new ArrayList<Review>() , "adventure");
        Novel N3 = new Novel("novel 3" , "ghida" , "3388441177" , 97 , 4 , new ArrayList<Review>() , "short story");









//        set Review

        N1.addReview(R1N);
        N2.addReview(R2N);
        N3.addReview(R3N);


        ac1.addReview(R1A);
        ac2.addReview(R2A);
        ac3.addReview(R3A);







//        restock


        ac3.restock(1);
        N2.restock(3);





//        add and display

        s1.addUser(u1);
        s1.addUser(u2);
        s1.addUser(u3);

        s1.addMedia(mo1);
        s1.addMedia(mo2);
        s1.addMedia(mo3);

        s1.addMedia(mu1);
        s1.addMedia(mu2);
        s1.addMedia(mu3);














        System.out.println("hello , welcome to media store , enter numbers 1 to 9 or -1 to quit : \n1- to display users. \n2- display medias. \n3- display ISBN. \n4- Average Rating. " +
                "\n5- Media Type. \n6- Beste Seller. \n7- stock.  ");


        int ch = s.nextInt() ;




    switch (ch) {
        case 1:

            s1.displayUsers();

            break;

        case 2:

            s1.displayMedia();

            break;

        case 3:

            System.out.println("enter number to display : \n1- Books. \n2- Movie. \n3- Music. ");
            int num = s.nextInt();

            if (num == 1) {

                System.out.println("Academic Book : ");

                System.out.println(ac1.getTitle() + " : " + ac1.getIsbn());
                System.out.println(ac2.getTitle() + " : " + ac2.getIsbn());
                System.out.println(ac3.getTitle() + " : " + ac3.getIsbn());

                System.out.println("Novel : ");

                System.out.println(N1.getTitle() + " : " + N1.getIsbn());
                System.out.println(N1.getTitle() + " : " + N1.getIsbn());
                System.out.println(N1.getTitle() + " : " + N1.getIsbn());


            } else if (num == 2) {

                System.out.println(mo1.getTitle() + " : " + mo1.getIsbn());
                System.out.println(mo2.getTitle() + " : " + mo2.getIsbn());
                System.out.println(mo3.getTitle() + " : " + mo3.getIsbn());


            } else if (num == 3) {

                System.out.println(mu1.getTitle() + " : " + mu1.getIsbn());
                System.out.println(mu2.getTitle() + " : " + mu2.getIsbn());
                System.out.println(mu3.getTitle() + " : " + mu3.getIsbn());


            } else


            break;

        case 4:

            System.out.println("Academic Book : ");

            System.out.println(ac1.getTitle() + " : " + ac1.getAverageRating());
            System.out.println(ac2.getTitle() + " : " + ac2.getAverageRating());
            System.out.println(ac3.getTitle() + " : " + ac3.getAverageRating());

            System.out.println("Novel : ");

            System.out.println(N1.getTitle() + " : " + N1.getAverageRating());
            System.out.println(N1.getTitle() + " : " + N1.getAverageRating());
            System.out.println(N1.getTitle() + " : " + N1.getAverageRating());


            break;

        case 5:

            System.out.println("Academic Book : ");

            System.out.println(ac1.getTitle() + " : " + ac1.getMediaType());
            System.out.println(ac2.getTitle() + " : " + ac2.getMediaType());
            System.out.println(ac3.getTitle() + " : " + ac3.getMediaType());

            System.out.println("Novel : ");

            System.out.println(N1.getTitle() + " : " + N1.getMediaType());
            System.out.println(N2.getTitle() + " : " + N2.getMediaType());
            System.out.println(N3.getTitle() + " : " + N3.getMediaType());


            break;

        case 6:

            System.out.println("Academic Book : ");

            System.out.println(ac1.getTitle() + " : " + ac1.isBesteSeller());
            System.out.println(ac2.getTitle() + " : " + ac2.isBesteSeller());
            System.out.println(ac3.getTitle() + " : " + ac3.isBesteSeller());

            System.out.println("Novel : ");

            System.out.println(N1.getTitle() + " : " + N1.isBesteSeller());
            System.out.println(N2.getTitle() + " : " + N2.isBesteSeller());
            System.out.println(N3.getTitle() + " : " + N3.isBesteSeller());


            break;


        case 7:

            System.out.println("Academic Book : ");

            System.out.println(ac1.getTitle() + " : " + ac1.getStock());
            System.out.println(ac2.getTitle() + " : " + ac2.getStock());
            System.out.println(ac3.getTitle() + " : " + ac3.getStock());

            System.out.println("Novel : ");

            System.out.println(N1.getTitle() + " : " + N1.getStock());
            System.out.println(N2.getTitle() + " : " + N2.getStock());
            System.out.println(N3.getTitle() + " : " + N3.getStock());

            break;


    }




    }
}