import java.util.Scanner;

public class MenaraHanoiRekursif {
    public static void hanoi(int n, char fromRod, char toRod, char auxRod) {
        if (n == 1) {
            System.out.println("Pindahkan cakram 1 dari tiang " + fromRod + " ke tiang " + toRod);
            return;
        }
        
        hanoi(n - 1, fromRod, auxRod, toRod);
        System.out.println("Pindahkan cakram " + n + " dari tiang " + fromRod + " ke tiang " + toRod);
        hanoi(n - 1, auxRod, toRod, fromRod);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah cakram: ");
        int n = scanner.nextInt();

        System.out.print("Masukkan tiang awal (A, B, atau C): ");
        char fromRod = scanner.next().charAt(0);

        System.out.print("Masukkan tiang tujuan (A, B, atau C): ");
        char toRod = scanner.next().charAt(0);

        System.out.print("Masukkan tiang bantu (A, B, atau C): ");
        char auxRod = scanner.next().charAt(0);

        hanoi(n, fromRod, toRod, auxRod);

        scanner.close();
    }
}
