package Lec5_Loop;
import java.util.Random;
public class bai11 {
    public static void main(String[] args) {
        Random rand = new Random();
        int dice1, dice2;
        int count = 0;
        do {
            dice1 = rand.nextInt(6) + 1;
            dice2 = rand.nextInt(6) + 1;
            count++;
            System.out.println("Roll " + count + ": " + dice1 + " and " + dice2);
        } while (dice1 != dice2);
        System.out.println("You rolled doubles after " + count + " tries!");
    }
}
