package Lec5_Loop;
import java.util.Scanner;
public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int h=scanner.nextInt();
        int fac=1;
        for(int i=1;i<=h;i++)
        {
            fac=fac*i;
        }
        System.out.println("The factorial of "+h+" is: "+fac);
    }
}
