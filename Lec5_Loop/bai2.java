package Lec5_Loop;
import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer from 2-9: ");
        int a=scanner.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(a + " x " + i + " = " + a*i);
        }
    }
}
