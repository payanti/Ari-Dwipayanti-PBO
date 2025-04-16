// Sistem Validasi Login
import java.util.Scanner;

public class LoginValidation {
    public static void main(String[] args) {
        // Data username dan password yang benar
        String correctUsername = "admin";
        String correctPassword = "password123";
        try (Scanner scanner = new Scanner(System.in)) {
            int attempts = 0;
            boolean loginSuccess = false;
            
            while (attempts < 3) {
                System.out.print("Masukkan username: ");
                String username = scanner.nextLine();
                
                System.out.print("Masukkan password: ");
                String password = scanner.nextLine();
                
                if (username.equals(correctUsername) && password.equals(correctPassword)) {
                    System.out.println("Selamat datang, " + username + "!");
                    loginSuccess = true;
                    break;
                } else {
                    attempts++;
                    if (attempts < 3) {
                        System.out.println("Username atau password salah! Percobaan: " + attempts + "/3");
                    }
                }
            }
            
            if (!loginSuccess) {
                System.out.println("Akun diblokir!");
            }
        }
    }
}
