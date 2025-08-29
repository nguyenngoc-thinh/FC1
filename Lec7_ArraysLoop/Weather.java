package Lec7_ArraysLoop;
import java.util.Scanner;
public class Weather {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many days' temparatures? ");
        int days=scanner.nextInt();
        int temp[] = new int[days];
        int sum=0;
        for (int i=0;i<days;i++)
        {
            System.out.print("Day " + (i+1) + "'s high temp: ");
            temp[i]=scanner.nextInt();
            sum=sum+temp[i];
        }
        double avg= (double) sum/days;
        int count=0;
        for(int i=0;i<days;i++)
        {
            if(temp[i]>avg)
            {
                count++;
            }
        }
        System.out.printf("Average temp = %.1f", avg);
        System.out.println();
        System.out.println(count + " days were above average");
    }
}
