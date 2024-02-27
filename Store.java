import java.util.ArrayList;
import java.util.List;

public class Store {


    private List<User> users ;
    private List<Media> medias ;






    Store (ArrayList<User> users , ArrayList<Media> medias ){

        this.medias =new ArrayList<>() ;
        this.users = new ArrayList<>() ;

    }


    public List<User> getUsers() {
        return users;
    }

    public void setUsers( List<User> users) {
        this.users = users;
    }

    public List<Media> getMedias() {
        return medias;
    }

    public void setMedias(List<Media> medias) {
        this.medias = medias;
    }




    public void addUser (User user){
        users.add(user);
    }



    public void displayUsers(){
        for (User user : users){
            System.out.println("User Name : " + user.getUserName() + " , Email : " + user.getEmail());
        }
    }



    public void addMedia(Media media){
        medias.add(media);


    }


    public void displayMedia(){

        for (Media media : medias){
            System.out.println(media);
        }
    }



    public Book searchBook (String title){

        for (Media media : medias){
            if (media instanceof Book && media.getTitle().equals(title)){
                return (Book) media ;
            }
        }

        return null ;
    }


}
