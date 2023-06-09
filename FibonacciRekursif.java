import java.util.Scanner;

public class FibonacciRekursif {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n -1) + fibonacci(n -2);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan batas deret Fibonacci: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");

        }

        scanner.close();
    }
}