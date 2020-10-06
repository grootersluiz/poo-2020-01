import java.util.Scanner;

public class Typing {
public static void main(String[] args){
    Scanner text = new Scanner(System.in);
    String name;

    System.out.println("Type your name: ");
    name = text.nextLine();

    System.out.println("Your name is " + name);
 }
}
