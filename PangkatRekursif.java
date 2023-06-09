import java.util.Scanner;

public class PangkatRekursif {
    public static int pangkat(int angka, int pangkat) {
        if (pangkat == 0) {
            return 1;
        } else {
            return angka * pangkat(angka, pangkat -1);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan sebuah angka: ");
        int angka = scanner.nextInt();

        System.out.print("Masukan pangkat: ");
        int pangkat = scanner.nextInt();

        int result = pangkat(angka, pangkat);
        System.out.println(angka + " pangkat " + pangkat + " = " + result);

        scanner.close();
    }
}