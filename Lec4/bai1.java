package Lec4;
import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        if (num % 2 == 0) 
        {
            System.out.println(num + " is an even number");
        } else 
        {
            System.out.println(num + " is an odd number");
        }
    }
}