package SMA;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SocialMediaApp {
    Map<String,User> userMap = new HashMap<>();
    Map<String ,Post> postMap = new HashMap<>();
    Map<Integer, Comment> commentMap = new HashMap<>();
    Scanner sc = new Scanner(System.in);




    void  showMenu() {
        while (true) {
            System.out.println("WELCOME TO SOCIAL MEDIA>>>>>>");
            System.out.println("1- Create Account. ");
            System.out.println("2- Login Account. ");
            System.out.println("3- EXIT. ");
            System.out.println("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                CreateAccount();
            } else if (choice == 2) {
                LoginAccount();
            } else if (choice == 3) {
                System.out.println("Thanks for Using Our SOCIAL MEDIA .");
                break;
            } else {
                System.out.println("Invalid choice");
            }

        }

    }
    void CreateAccount() {
        System.out.print("Enter your id: ");
        String userId = sc.nextLine();

        System.out.print("Enter user name: ");
        String userName = sc.nextLine();

        System.out.print("Enter user email: ");
        String email = sc.nextLine();

        System.out.print("Enter user Contact: ");
        String contact = sc.nextLine();

        System.out.print("Enter user password: ");
        String password = sc.nextLine();

        User newUser = new User(userId, userName, email, contact, password);
        userMap.put(userId, newUser);

        System.out.println("Account Created Successfully.");
        showUserMenu(newUser);
    }
    void showUserMenu(User currentUser){
        while (true){
            System.out.println("1 Add new post");
            System.out.println("2 Update Account");
            System.out.println("3 Update Post");
            System.out.println("4 Comment on Post");
            System.out.println("5 Like on Post");
            System.out.println("6 Delete Comment on Post");
            System.out.println("7 Show all Feed");
            System.out.println("8 LogOut");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice ) {
                case 1:
                    addNewPost(currentUser);
                    break;

                case 2:
                    updateAccount(currentUser);
                    break;

                case 3:
                    updatePost(currentUser);
                    break;

                case 4:
                    commentPost(currentUser);
                    break;

                case 5:
                    likePost(currentUser);
                    break;

                case 6:
                    deleteComment(currentUser);
                    break;

                case 7:
                    showFeed();
                    break;
                case 8:
                    return;
            }
        }
    }
    void addNewPost(User currentUser){
        System.out.println("Enter Post Id");
        String postId = sc.nextLine();

        System.out.print("Add New Post Text: ");
        String postText = sc.nextLine();

        Post newpost = new Post(postId, postText,0);
        postMap.put(postId, newpost);
        currentUser.posts.put(postId, newpost);
        System.out.println("Post Added Successfully.");

    }

    void updateAccount(User currentUser){
        System.out.println("1.Update Email");
        System.out.println("2.Update Contact");
        System.out.println("3.Update Password");
        System.out.println("Enter Your Choice.");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice){
            case 1:
                System.out.println("Enter New Email");
                currentUser.email = sc.nextLine();
                System.out.println("Email Updated Successfully");
                break;

            case 2:
                System.out.println("Enter New Contact");
                currentUser.contact = sc.nextLine();
                System.out.println("Contact Updated Successfully");
                break;

            case 3:
                System.out.println("Enter New Password");
                currentUser.password = sc.nextLine();
                System.out.println("Password Updated Successfully");
                break;
        }
    }

    void updatePost(User currentUser){
        System.out.println("Enter Post Id to Update");
        String postId = sc.nextLine();

        if (currentUser.posts.containsKey(postId)) {
            Post post = currentUser.posts.get(postId);
            System.out.println("Enter new text for post:");
            String newText = sc.nextLine();
            post.text = newText;
            System.out.println("Post Updated Successfully.");
        }

    }

    void commentPost(User currentUser){
        System.out.println("Enter Post Id To Comment");
        String postId = sc.nextLine();

        if (postMap.containsKey(postId)){
            Post post = postMap.get(postId);
            System.out.println("Enter Comment Id");
            int commentId = sc.nextInt();
            sc.nextLine();


            System.out.println("Enter your New Comment");
            String commentText = sc.nextLine();
            Comment newComment = new Comment(String.valueOf(commentId), currentUser.userId,commentText);
            post.commentMap.put(String.valueOf(commentId), newComment);

            System.out.println("Comment Added Successfully");
        }else {
            System.out.println("Post Id Not Found");
        }
    }

    void likePost(User currentUser){
        System.out.println("Enter Post Id To Like Post");
        String postId = sc.nextLine();

        if (postMap.containsKey(postId)){
            Post post =  postMap.get(postId);
            post.postInfo();
            post.likes++;
            System.out.println("Post Liked Successfully.");
        }else {
            System.out.println("Post Id Not Found");
        }
    }

    void deleteComment(User currentUser){
        System.out.println("Enter Comment Id to Delete Comment.");
        int commentId = sc.nextInt();
        sc.nextLine();

        if (commentMap.containsKey(commentId)){
            commentMap.remove(commentId);
            System.out.println("Comment Deleted Successfully");
        }else{
            System.out.println("Comment Id Not Found.");
        }
    }

    void  showFeed(){
        if (postMap.isEmpty()){
            System.out.println("No Post Available");
        }else {
            for (Post post: postMap.values()){
                post.postInfo();
            }
        }
    }
    void LoginAccount(){
        System.out.println("Enter User Id");
        String userId = sc.nextLine();

        System.out.print("Enter user password: ");
        String password = sc.nextLine();

        if (userMap.containsKey(userId)){
            User user = userMap.get(userId);
            if (user.password.equals(password)){
                System.out.println("Login Successfully."+user.username);
            }else {
                System.out.println("Incorrect Password");
            }
        }else {
            System.out.println("User Id Not Found");
        }
    }
}