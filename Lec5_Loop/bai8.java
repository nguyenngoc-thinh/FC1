package Lec5_Loop;
import java.util.Scanner;
public class bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=0;
        System.out.print("Enter a number from 1 to 10: ");
        do
        {
            a=scanner.nextInt();
            if(a>=1&&a<=10)
            {
                System.out.println("Your enter the number: "+a);
            }
            else
            {
                System.out.print("Invalid number, please try again: ");
            }
        }
        while( a<=1 || a>=10 );
    }
}
