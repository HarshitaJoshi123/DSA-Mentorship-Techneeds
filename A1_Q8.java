package mentorship.assignment1;
import java.util.Scanner;

public class A1_Q8 {
    public static void main(String[] args) {
        //ques8 - Rotate a number
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int nod = 0;  //number of digits
        int temp = n; //temporarily storing number to perform division
        while (temp != 0)
        {
            temp /= 10;
            nod++;
        }
        //25398 will give nod = 5
        int div = 1;  //initialize divisor = 1
        int mult = 1; //initialize multiplier = 1

        for (int i = 1; i <= nod; i++)
        {
            if (i <= k) //while the iterator is less than k
            { //we increase the value of divisor
                div *= 10;
            }
            else         //or else we increase the value of multiplier
            {
                mult *= 10;
            }
        }

        int quo = n / div;    // extracting the quotient
        int rem = n % div;    // extracting the remainder

        int r = rem * mult + quo; //forming the rotated number
        System.out.println(r);
    }
}
