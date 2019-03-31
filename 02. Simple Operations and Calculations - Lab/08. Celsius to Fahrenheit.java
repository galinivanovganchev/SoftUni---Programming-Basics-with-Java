import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Celsius = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.2f" ,  ((Celsius*9)/5) + 32);
    }
}