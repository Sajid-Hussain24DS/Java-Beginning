package SMA;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Post {
    String postId;
    String text;
    int likes;
    Map<String, Comment> commentMap = new HashMap<>();

    public Post(String postId, String text,int likes) {
        this.postId = postId;
        this.text = text;
        this.likes = 0;
    }
        public void addLikes() {
            likes++;
        }

    public void postInfo() {
        System.out.println("Post ID: " + postId);
        System.out.println("Text: " +  text);
        System.out.println("Likes: " + likes);
        for (Comment c : commentMap.values()) {
            System.out.println("Comment: " + c.commenttext + " (by " + c.userId + ")");
        }
    }

}
