package Lec5_Loop;
import java.util.Random;
import java.util.Scanner;
public class bai7 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int n = random.nextInt(100) + 1;
        int a=0;
        do
        {
            System.out.print("Your guess: ");
            a=scanner.nextInt();
            if(a>n)
            {
                System.out.println("Your number is higher than the secret number");
            }
            else if(a<n)
            {
                System.out.println("Your number is lower than the secret number");
            }
            else
            {
                System.out.println("Congratulations! You guessed correctly");
            }
        }
        while(a!=n);
    }
}
