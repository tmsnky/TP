import java.util.Scanner;

public class task3 {
    private final static int PASSWORD = 1235210; //password(can be changed)

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введіть пароль:");
            int inputPassword = scanner.nextInt();

            if (inputPassword == PASSWORD) {
                System.out.println("Hello, Agent");
            } else {
                System.out.println("Access denied");
            }
        }
    }
}