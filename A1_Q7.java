package mentorship.assignment1;
import java.util.Scanner;

public class A1_Q7 {
    public static void main(String[] args) {
        //ques7 - Inverse of a number
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int inverted = 0;
        int power = 1;

        while (n > 0) {
            int digit = n % 10;
            n = n / 10;
            inverted += power * Math.pow(10, digit - 1);
            power++;
        }
        System.out.println(inverted);
    }
}
