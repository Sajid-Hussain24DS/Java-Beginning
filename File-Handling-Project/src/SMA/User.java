package SMA;
import java.util.Map;
import java.util.HashMap;

public class User {
    String userId;
    String username;
    String email;
    String contact;
    String password;
    Map<String, Post> posts = new HashMap<>();



    public User(String userId, String username, String email, String contact, String password) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.contact = contact;
        this.password = password;
    }
}
