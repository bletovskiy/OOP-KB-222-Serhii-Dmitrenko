import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a, b, c: ");
        int a = scan.nextInt(); // Равлик підіймається по дереву на "а" футів в день
        int b = scan.nextInt(); // Сповзає щоночі на "b" футів
        int h = scan.nextInt(); // Висота дерева "h"

        if (b >= a){
            System.out.println("Impossible");
            System.exit(0);
        }

        int days = (h - b - 1) / (a - b) + 1;

        System.out.println(days);
        scan.close();
    }
}
