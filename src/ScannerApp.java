import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = scanner.nextLine();

        System.out.print("Enter your age : ");
        int age = scanner.nextInt();

//        scanner.nextInt();
//        scanner.nextBoolean();
//        scanner.nextFloat();


        System.out.println("Hello " + name + " umur " + age);
    }
}
