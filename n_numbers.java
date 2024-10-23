// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

public class SumNA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
        int sum = 0;

        // Sum the first n natural numbers
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }
}
