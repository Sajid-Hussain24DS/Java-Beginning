public class Main {
    public static void main(String[] args) {
        String string ="abbbcccac";

        //Sample output
        //s = "abbbcccac" -> "abbbac"-> "aac" final output
        string = string.replace("bbbccc","");
        System.out.println(string);


    }
}