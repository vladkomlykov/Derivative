import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите функцию");

        Derivative derivative = new Derivative();

        derivative.function = scanner.next();
    }
}