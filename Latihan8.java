//Interface Kendaraan
interface Kendaraan {
    void berjalan();
}

// Implementasi pertama: Mobil
class Mobil implements Kendaraan {
    public void berjalan() {
        System.out.println("Mobil berjalan dengan roda 4.");
    }
}

// Implementasi kedua: Motor
class Motor implements Kendaraan {
    public void berjalan() {
        System.out.println("Motor berjalan dengan roda 2.");
    }
}

// Main class
public class Latihan8 {
    public static void main(String[] args) {
        // Membuat objek dengan referensi interface
        Kendaraan kendaraan1 = new Mobil();
        Kendaraan kendaraan2 = new Motor();

        // Memanggil metode berjalan() berdasarkan objek yang dibuat
        kendaraan1.berjalan();
        kendaraan2.berjalan();
    }
}
