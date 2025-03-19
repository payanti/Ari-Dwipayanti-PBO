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

// Kelas anak dari Kucing (subclass) yang mewarisi dari Kucing
class KucingAnggora extends Kucing {
    void jenis() {
        System.out.println("Ini adalah kucing anggora.");
    }
}

// Main class untuk menjalankan program
public class Latihan2 {
    public static void main(String[] args) {
        KucingAnggora anggora = new KucingAnggora();

        anggora.makan();  // Dari superclass Hewan
        anggora.suara();  // Dari subclass Kucing
        anggora.jenis();   // Dari subclass KucingAnggora
    }
}
