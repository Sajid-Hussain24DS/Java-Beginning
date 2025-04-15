package Social_Media_App;

import java.util.*;

public class User {
    String userId;
    String userName;
    String email;
    String contact;
    String password;
    ArrayList<Post> posts;


    User(String userId,String userName, String email, String contact
          ,String password) {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.contact = contact;
        this.password = password;
        this.posts = new ArrayList<>();

    }

    public void userInfo(){
        System.out.println("User ID:" + userId);
        System.out.println("User Name: " + userName);
        System.out.println("User Email: " + email);
        System.out.println("User Contact: " + contact);
        System.out.println("User Password:" + password);

    }
}
