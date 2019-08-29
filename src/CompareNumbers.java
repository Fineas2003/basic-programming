import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
                int number1;
                int number2;
        System.out.print("first number");
        number1 = input.nextInt();

        System.out.print("second number");
        number2 = input.nextInt();

        if (number1 == number2)
            System.out.printf("%d == %d/n ", number1, number2); //de ce se pune /n, %d?
        if (number1 < number2)
            System.out.printf("%d < %d/n ", number1, number2);
        if (number1 >number2)
            System.out.printf("%d > %d/n", number1, number2);
        if (number1 <= number2)
            System.out.printf("%d <= %d/n", number1, number2);
        if (number1 >= number2)
            System.out.printf("%d >= %d/n", number1, number2);
        if (number1 != number2)
            System.out.printf("%d != %d/n", number1, number2);


    }
}
