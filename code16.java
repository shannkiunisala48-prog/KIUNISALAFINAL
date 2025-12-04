
/**
 * Write a description of class code16 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class code16
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String numStr = sc.nextLine();

        int length = numStr.length();

        if (numStr.charAt(0) == '-') {
            length = length - 1;
        }

        System.out.println("The number of digits: " + length);
        sc.close();
    }
}
    