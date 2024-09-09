import java.util.Scanner;

public class GettingGreater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Getting the Greater Value");
        System.out.print("Enter first character: ");
        char charfirst = input.next().charAt(0);

        System.out.print("Enter second character: ");
        char charsecond = input.next().charAt(0);

        char maxChar = (char) Math.max(charfirst, charsecond);

        System.out.println("------------------------------");
        System.out.println("The character with greater value is: " + maxChar);
        System.out.println("------------------------------");

        System.out.println("Showing the ASCII Codes");
        System.out.println("f: " + (int)charfirst);
        System.out.println("A: " + (int)charsecond);

        input.close();
    }
}