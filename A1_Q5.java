package mentorship.assignment1;
import java.util.Scanner;

public class A1_Q5 {
    public static void main(String[] args) {
        //ques5 - Count Digits in a number
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n!=0){
            n = n/10;
            count++;
        }
        System.out.println(count);
    }
}
