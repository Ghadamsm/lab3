import java.util.ArrayList;
import java.util.List;

public class User {

  private String userName ;
  private String email ;
  private List<Media> purchasedMediaList ;
  private List<Media> shoppingCart ;





  User (String userName , String email ){
      this.userName = userName ;
      this.email = email ;


  }

  User ( List<Media> purchasedMediaList , List<Media> shoppingCart){
      this.purchasedMediaList = new ArrayList<>();
      this.shoppingCart = new ArrayList<>() ;
  }



    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Media> getPurchasedMediaList() {
        return purchasedMediaList;
    }

    public void setPurchasedMediaList(List<Media> purchasedMediaList) {
        this.purchasedMediaList = purchasedMediaList;
    }

    public List<Media> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(List<Media> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }








    public void addToCart(Media addMedia){

      shoppingCart.add(addMedia);

    }


    public void removeFromCart(Media remMedia){

      shoppingCart.remove(remMedia);

    }



    public void checkout(){

      purchasedMediaList.addAll(shoppingCart);

    }


    public void addToPurchasedMedia(Media media){
      purchasedMediaList.add(media);

    }





}
