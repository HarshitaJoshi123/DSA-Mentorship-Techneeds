package mentorship.assignment1;
import java.util.Scanner;

public class A1_Q4 {
    public static void main(String[] args) {
        //ques4 - Print all primes till N
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower limit of the range: ");
        int a = sc.nextInt();
        System.out.print("Enter the upper limit of the range: ");
        int b = sc.nextInt();
        for(int i = a; i<=b; i++){
            int count = 0;
            for(int j = 1; j<=i; j++){
                if(i%j == 0){
                    count++;
                }
            }
            if(count == 2){
                System.out.println(i);
            }
        }
    }
}
