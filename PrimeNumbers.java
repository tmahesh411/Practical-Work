//Q1. Write a Java program to display 1 to Nth Prime Numbers using for loop. 



import java.util.*;

public class PrimeNumbers {
    public static void main(String x[]) {
        Scanner xyz = new Scanner(System.in);

        System.out.print("Enter N : ");
        int n = xyz.nextInt();

        System.out.println("Prime Numbers are:");

        for (int num = 2; num <= n; num++) {

            int count = 0;

            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.print(num + " ");
            }
        }
    }
}