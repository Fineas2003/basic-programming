import java.util.Scanner;

public class divide {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduceti a");
        a=scanner.nextInt();
        System.out.println("introduceti b");
        b=scanner.nextInt();
        System.out.println("rezultatul este "+ (a/b));
    }
}
