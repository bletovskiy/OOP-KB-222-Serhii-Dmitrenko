package lab1;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        
        while (true){
            int num = scan.nextInt();
            if(num == 0){
                break;
            }
            if(num > max){
                max = num;
            }
        }
        System.out.println(max);
        scan.close();
    }
}