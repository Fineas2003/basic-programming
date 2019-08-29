import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {;
        //System.out.println("Hello world");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numele dumneavoastra:");
        String nume = scanner.nextLine();
        System.out.println("Hello " + nume);
    }
}
