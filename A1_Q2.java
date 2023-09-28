package mentorship.assignment1;
import java.util.Scanner;

public class A1_Q2 {
    public static void main(String[] args) {
        //ques2 - Grading System
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the marks of a student: ");
        int marks = sc.nextInt();
        if (marks>90){
            System.out.println("excellent");
        }
        else if (marks>80 && marks<= 90){
            System.out.println("good");
        }
        else if (marks>70 && marks<=80){
            System.out.println("fair");
        }
        else if (marks>60 && marks<=70){
            System.out.println("meets expectations");
        }
        else{
            System.out.println("below par");
        }
    }
}
