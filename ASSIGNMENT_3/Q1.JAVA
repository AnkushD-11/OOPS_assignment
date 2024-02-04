import java.io.*;

public class q1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your name: ");
        String userInput = reader.readLine();
        System.out.println("Hello! " + userInput);
        if (reader != null) {
            reader.close();
        }
    }
}
