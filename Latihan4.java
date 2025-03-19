// Antarmuka Hewan
interface Hewan {
    void makan();
}

// Antarmuka Mamalia
interface Mamalia {
    void menyusui();
}

// Kelas Kucing yang mengimplementasikan antarmuka Hewan dan Mamalia
class Kucing implements Hewan, Mamalia {
    public void makan() {
        System.out.println("Kucing makan ikan.");
    }

    public void menyusui() {
        System.out.println("Kucing menyusui anaknya.");
    }
}

// Kelas Main untuk menjalankan program
public class Latihan4 {
    public static void main(String[] args) {
        // Membuat objek Kucing
        Kucing kucing = new Kucing();

        // Memanggil metode yang dimiliki oleh Kucing
        kucing.makan();      // Memanggil metode dari antarmuka Hewan
        kucing.menyusui();   // Memanggil metode dari antarmuka Mamalia
    }
}
