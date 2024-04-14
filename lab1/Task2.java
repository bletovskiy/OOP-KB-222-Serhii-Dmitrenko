package lab1;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int time = scan.nextInt();
        int sec = time % 60;
        int min = (time % 3600) / 60;
        int hour = time / 3600;
        System.out.printf("%d:%02d:%02d\n", hour, min, sec);
        scan.close();
    }
}