package mentorship.assignment1;
import java.util.Scanner;

public class A1_Q10 {
    public static void main(String[] args) {
        //ques10 - Prime factorization of a number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        for (int div = 2; div <= n; div++)
        {
            while (n % div == 0)
            {
                System.out.print(div + " ");
                n = n / div;
            }
        }
        if (n != 1)
        {
            System.out.print(n);
        }
    }
}
