import java.util.Scanner;

public class InchesToCms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double inches = scanner.nextDouble();
        Double centimeters = inches * 2.54;
        System.out.print(centimeters);
    }
}
