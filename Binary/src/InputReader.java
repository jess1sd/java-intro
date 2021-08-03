import java.util.Scanner;

public class InputReader {
            
    private Scanner myObj;  // Create a Scanner object

    public InputReader() {
        myObj = new Scanner(System.in);
    }
    public String readUserInput(String ask) {

        System.out.print("Enter " + ask + ": ");
        String input = myObj.nextLine();  // Read user input
        return input;
    }

    public void close() {
        myObj.close();
    }
}
