package Lec5_Loop;
import java.util.Scanner;
public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("height = ");
        int h=scanner.nextInt();
        System.out.print("width = ");
        int w=scanner.nextInt();
        for(int i=0;i<h;i++)
        {
            for(int j=0;j<w;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
