// Kelas induk (superclass)
class Hewan {
    String nama;

    // Konstruktor untuk menginisialisasi nama
    Hewan(String nama) {
        this.nama = nama;
    }

    // Metode untuk menampilkan informasi
    void info() {
        System.out.println("Nama: " + nama);
    }
}

// Kelas anak (subclass) yang mewarisi dari Hewan
class Kucing extends Hewan {
    // Konstruktor untuk menginisialisasi nama menggunakan konstruktor superclass
    Kucing(String nama) {
        super(nama); // Memanggil konstruktor superclass
    }

    // Metode tambahan untuk kucing
    void suara() {
        System.out.println(nama + " mengeong: Meow!");
    }
}

// Kelas Main untuk menjalankan program
public class Latihan5 {
    public static void main(String[] args) {
        // Membuat objek Kucing
        Kucing kucing = new Kucing("Tomtom");

        // Memanggil metode yang dimiliki oleh Kucing
        kucing.info();  // Memanggil metode dari superclass Hewan
        kucing.suara(); // Memanggil metode dari subclass Kucing
    }
}