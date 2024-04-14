import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("ax^2 + bx + c = 0");
        System.out.println("Enter a, b, c");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double D;

        D = b * b - 4 * a * c;

        if(D > 0){
            double x1 = (-b - Math.sqrt(D)) / (2 * a);
            double x2 = (-b + Math.sqrt(D)) / (2 * a); 
            System.out.println(" x1 = " + x1 + " x2 = " + x2);
        }else if (D == 0){
            double x;
            x = -b / (2 * a);
            System.out.println("x = " + x);
        }else{
            System.out.println("nothing");
        }
        
        scan.close();

    }
}