package Social_Media_App;

public class Comment {
    int commentId;
    String userId;
    String commentText;

    Comment(int commentId, String userId, String commentText){
        this.commentId = commentId;
        this.userId = userId;
        this.commentText = commentText;


    }

    public void commentInfo(){
        System.out.println("Comment by user "+userId+ " " + commentText);

    }


}
