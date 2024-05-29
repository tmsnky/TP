import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введiть рядок:");
            String input = scanner.nextLine();
            System.out.println("Hello, " + input);
        }
    }
}