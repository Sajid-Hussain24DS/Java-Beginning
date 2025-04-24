package SMA;

import java.io.*;
import java.util.*;

public class App_Data {

    Map<String, User> users = new HashMap<>();
    String filePath = "Media data.txt";

    void saveUsers() {
        System.out.println("Save data ");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (User user : users.values()) {
                writer.write(user.userId + "," + user.username + "," + user.email + "," + user.contact + "," + user.password);
                writer.newLine();
                for (Post post : user.posts.values()) {
                    writer.write("  " + post.postId + "," + post.text + "," + post.likes);
                    writer.newLine();
                    for (Comment comment : post.commentMap.values()) {
                        writer.write("    " + comment.commentId + "," + comment.userId + "," + comment.commenttext);
                        writer.newLine();
                    }
                }

            }
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    void loadUsers() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            User currentUser = null;
            Post currentPost = null;

            while ((line = reader.readLine()) != null) {
                if (!line.startsWith("  ")) {
                    String[] userData = line.split(",", 5);
                    if (userData.length >= 5) {
                        String userId = userData[0];
                        String username = userData[1];
                        String email = userData[2];
                        String contact = userData[3];
                        String password = userData[4];

                        currentUser = new User(userId, username, email, contact, password);
                        users.put(userId, currentUser);
                    }
                } else if (line.startsWith("  ") && currentUser != null) {
                    // Post line
                    String[] postData = line.trim().split(",", 3);
                    if (postData.length >= 3) {
                        String postId = postData[0];
                        String text = postData[1];
                        int likes = Integer.parseInt(postData[2]);

                        currentPost = new Post(postId, text, likes);
                        currentUser.posts.put(postId, currentPost);
                    }
                } else if (line.startsWith("    ") && currentPost != null) {

                    String[] commentData = line.trim().split(",", 3);
                    if (commentData.length >= 3) {
                        String commentId = commentData[0];
                        String userId = commentData[1];
                        String commentText = commentData[2];

                        Comment comment = new Comment(commentId, userId, commentText);
                        currentPost.commentMap.put(commentId, comment);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error loading data: " + e.getMessage());
        }
    }}