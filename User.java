//this part is for username and password
public class User {

    public static String username;
    public static String password;

    //user and password
    private  static final String[][] accounts = {{"farhan", "f123"},{"jack", "jack123"},{"love", "love123"}};

    public static void users(String name, String pass)
    {
        username = name;
        password = pass;
    }

    //for authentication
    public static boolean auth(){
        return (username.equals(accounts[0][0])) && (password.equals(accounts[0][1])) ||
                (username.equals(accounts[1][0])) && (password.equals(accounts[1][1])) ||
                (username.equals(accounts[2][0])) && (password.equals(accounts[2][1]));
    }



}