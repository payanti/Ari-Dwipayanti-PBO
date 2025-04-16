import java.util.Random;
import java.util.Scanner;

public class TebakAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        int angkaTebakan = random.nextInt(100) + 1; // Angka 1 - 100
        int tebakan;
        int jumlahPercobaan = 0;

        System.out.println("Selamat datang di permainan Tebak Angka!");
        System.out.println("Saya telah memilih angka antara 1 hingga 100.");
        System.out.println("Coba tebak angka tersebut! (Ketik 0 untuk keluar)");

        while (true) {
            System.out.print("Masukkan tebakan Anda: ");
            tebakan = input.nextInt();

            if (tebakan == 0) {
                System.out.println("Permainan dihentikan. Terima kasih!");
                break;
            }

            jumlahPercobaan++;

            if (tebakan == angkaTebakan) {
                System.out.println("Selamat! Anda menebak angka dengan benar dalam " + jumlahPercobaan + " percobaan.");
                System.out.println("Terima kasih telah bermain!");
                break;
            } else if (tebakan < angkaTebakan) {
                System.out.println("Terlalu kecil! Coba lagi.");
            } else {
                System.out.println("Terlalu besar! Coba lagi.");
            }
        }

        input.close();
    }
}
