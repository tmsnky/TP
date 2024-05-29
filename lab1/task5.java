import java.util.Scanner;

public class task5{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введіть кількість футів, які равлик піднімається на день (a):");
            int a = scanner.nextInt();
            System.out.println("Введіть кількість футів, які равлик сповзає вниз за ніч (b):");
            int b = scanner.nextInt();
            System.out.println("Введіть висоту дерева в футах (h):");
            int h = scanner.nextInt();
            
            int days = (h - b + (a - b - 1)) / (a - b);
            
            if (h - b <= 0) {
                System.out.println("Impossible");
            } else {
                System.out.println("Кількість днів, необхідних равлику для досягнення вершини дерева: " + days);
            }
        }
    }
}