import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many strangers will you meet?");
        int count = scan.nextInt();

        if(count <= 0){
            System.out.println("An invalid value has been entered. The number of strangers must be greater than zero");
            System.exit(0);
        }
        
        System.out.println("Enter the names of strangers");
        scan.nextLine();

        for (int i = 0; i < count; i++) {
            String name = scan.nextLine();
            System.out.println("Hello " + name);
        }
        scan.close();
    }
}
