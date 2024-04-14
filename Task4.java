import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Сколько незнакомцов вы встретите?");
        int count = scan.nextInt();

        if(count <= 0){
            System.out.println("Введено некоректное значение. Количество незнакомцов должно быть больше нуля");
            System.exit(0);
        }
        
        System.out.println("Введите имена незнакомцов");
        scan.nextLine();

        for (int i = 0; i < count; i++) {
            String name = scan.nextLine();
            System.out.println("Hello " + name);
        }
        scan.close();
    }
}