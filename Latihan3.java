class Hewan {
    void makan() {
        System.out.println("Hewan sedang makan.");
    }
}

// Kelas anak (subclass) yang mewarisi dari Hewan
class Kucing extends Hewan {
    void suara() {
        System.out.println("Meow!");
    }
}

// Kelas anak (subclass) yang mewarisi dari Hewan
class Anjing extends Hewan {
    void suara() {
        System.out.println("Guk Guk!");
    }
}

// Main class untuk menjalankan program
public class Latihan3 {
    public static void main(String[] args) {
        // Membuat objek Kucing
        Kucing kucing = new Kucing();
        System.out.println("Kucing:");
        kucing.makan();  // Memanggil metode dari superclass Hewan
        kucing.suara();  // Memanggil metode dari subclass Kucing

        // Membuat objek Anjing
        Anjing anjing = new Anjing();
        System.out.println("\nAnjing:");
        anjing.makan();  // Memanggil metode dari superclass Hewan
        anjing.suara();  // Memanggil metode dari subclass Anjing
    }
}
