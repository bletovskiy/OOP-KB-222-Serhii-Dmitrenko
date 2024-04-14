import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Tax - 10%");
        System.out.print("Enter the number of friends and the total amount of the check: ");
        int friends = scan.nextInt();
        int money = scan.nextInt();

        if (friends <= 0 || money <= 0){
            System.out.println("impossible");
            System.exit(0);
        }else{
            double friendsum = (money * 1.1) / friends;
            System.out.println((int) friendsum);
        }
        
        scan.close();
    }
}
