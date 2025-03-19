package kendaraan;

public class Kendaraan {
    // Atribut
    String merk;
    String tipe;
    int kecepatan;

    // Konstruktor
    public Kendaraan(String merk, String tipe, int kecepatan) {
        this.merk = merk;
        this.tipe = tipe;
        this.kecepatan = kecepatan;
    }

    // Menampilkan informasi kendaraan
    public void tampilkanInfo() {
        System.out.println("Merk: " + merk + ", Tipe: " + tipe + ", Kecepatan: " + kecepatan + " km/jam");
    }

    // Menambah kecepatan kendaraan
    public void tambahKecepatan(int km) {
        kecepatan += km;
        System.out.println(merk + " menambah kecepatan menjadi " + kecepatan + " km/jam.");
    }

    // Mengurangi kecepatan kendaraan
    public void kurangiKecepatan(int km) {
        kecepatan = Math.max(0, kecepatan - km);
        System.out.println(merk + " mengurangi kecepatan menjadi " + kecepatan + " km/jam.");
    }

    // Berhenti
    public void berhenti() {
        kecepatan = 0;
        System.out.println("Kendaraan telah berhenti.");
    }
}