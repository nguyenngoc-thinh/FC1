package Lec5_Loop;
import java.util.Scanner;
public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int h=scanner.nextInt();
        int sum=1;
        for(int i=1;i<=h;i++)
        {
            sum=sum*i;
        }
        System.out.println("The sum of the digits is: "+sum);
    }
}
