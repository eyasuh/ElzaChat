import java.util.Scanner;
public class ElzaChat {
    public static void main(String[] args) {
        // greeting message
        System.out.println("Welcome to ElizaChats! My name is Eliza, What's your name?");
        Scanner input = new Scanner(System.in);
        //
        String name = input.nextLine();
        System.out.println("Nice to meet you, " + name + ", How has your day been?");
        String response = input.nextLine();
        System.out.println("Okay, Anything in particular that makes you feel that " +response + "?");
        String response2 = input.nextLine();
        System.out.println("Okay, Well it has been my pleasure to speak with you. Have a nice day!/n");
        System.out.println("Here are your responses: " + name +" " + response + " "+ response2);
        //


    }
}
