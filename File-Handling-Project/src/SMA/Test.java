package SMA;
public class Test{
public static void main(String[] args) {
    App_Data data = new App_Data();
    data.loadUsers();

    SocialMediaApp app = new SocialMediaApp();
    app.userMap = data.users;
    app.showMenu();

    data.users = app.userMap;
    data.saveUsers();
}}
