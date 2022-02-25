/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.*;

public class Main {

    public static void main(String[] args ){
        String userName;
        String guest1 = "Alice";
        String guest2 = "Bob";

        Scanner scan = new Scanner(System.in);
        System.out.println("Hello, what is your name?");
        userName = scan.nextLine();

        if (userName.equals(guest1)) {
            System.out.println("Welcome Alice. I've been expecting you!");
        } else if (userName.equals(guest2)) {
            System.out.println("Welcome Bob. I've been expecting you!");
        } else {
            System.out.println("Your name is not Alice or Bob. I was not expecting you. GoodBye");
        }

    }
}
