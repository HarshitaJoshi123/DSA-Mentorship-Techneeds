package mentorship.assignment1;
import java.util.Scanner;

public class A1_Q3 {
    public static void main(String[] args) {
        //ques3 - Is a number prime
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the count of input numbers to be tested: ");
        int t = sc.nextInt();
        for(int i = 0; i<t; i++){
            int n = sc.nextInt();
            int count = 0;
            for(int j=1; j<=n; j++){
                if(n%j == 0){
                    count++;
                }
            }
            if(count == 2){
                System.out.println("prime");
            }
            else{
                System.out.println("not prime");
            }
        }

    }
}
