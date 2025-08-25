package Lec5_Loop;
import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input N: ");
        int n= scanner.nextInt();
        int sum=0;
        for(int i=1; i<=n ; i++)
        {
            sum=sum+i;
        }
        System.out.println("The sum of numbers from 1 to "+n+" is: "+sum);
    }
}
