import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введіть загальну суму рахунку:");
            double totalBill = scanner.nextDouble();

            if (totalBill < 0) {
                System.out.println("Сума рахунку не може бути від'ємною.");
                return;
            }

            System.out.println("Введіть кількість друзів:");
            int numFriends = scanner.nextInt();

            if (numFriends <= 0) {
                System.out.println("Кількість друзів має бути додатнім числом.");
                return;
            }
            double perPersonPayment = (totalBill + totalBill * 0.10) / numFriends;

            System.out.printf("Розмір частини оплати на кожного друга: %.2f%n", perPersonPayment);
        }
    }
}