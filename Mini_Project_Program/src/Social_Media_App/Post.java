package Social_Media_App;

import java.util.ArrayList;
import java.util.List;

public class Post {
    String postId;
    String postText;
    int noOflikes;
    List<Comment> comments;



    Post(String postId,String postText){
    this.postId = postId;
    this.postText = postText;
    this.noOflikes = 0;
    this.comments= new ArrayList<>();
    }

    void addComment(Comment comment){
        comments.add(comment);
    }
    void addLikes(){
        noOflikes++;
    }
    public void postInfo() {
        System.out.println("Post ID: " + postId);
        System.out.println("Post Text: " + postText);
        System.out.println("Post Likes: " + noOflikes);
        System.out.println("Post Comment: ");
        for (Comment comment: comments){
            comment.commentInfo();
        }}
        void updatePostText(String newText){
        this.postText = newText;
        }


    }

