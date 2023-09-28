package mentorship.assignment1;
import java.util.Scanner;

public class A1_Q6 {
    public static void main(String[] args) {
        //ques6 - Reverse a number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        while (n != 0) {
            int digit = n % 10;
            n = n / 10;

            System.out.print(digit);
        }
    }
}
