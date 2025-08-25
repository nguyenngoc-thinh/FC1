package Lec5_Loop;
import java.util.Scanner;
public class bai12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        int n = scanner.nextInt();
        if (n <= 1) 
        {
            System.out.println(n + " is not a prime number.");
        } 
        else 
        {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) 
            {
                if (n % i == 0) 
                {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) 
            {
                System.out.println("Output: " + n + " is a prime number.");
            } else 
            {
                System.out.println("Output: " + n + " is not a prime number.");
            }
        }
    }
}
