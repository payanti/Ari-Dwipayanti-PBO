package kendaraan;

public class kendaraanout {
    public static void main(String[] args) {
        // Membuat objek Kendaraan
        Kendaraan kendaraan1 = new Kendaraan("Toyota", "Mobil", 60);
        Kendaraan kendaraan2 = new Kendaraan("Yamaha", "Motor", 40);

        // Proses kendaraan1
        kendaraan1.tampilkanInfo();
        kendaraan1.tambahKecepatan(20); // Dari 60 jadi 80
        kendaraan1.kurangiKecepatan(30); // Dari 80 jadi 50
        kendaraan1.berhenti(); // Kecepatan menjadi 0
        kendaraan1.tampilkanInfo(); // Menampilkan info terakhir

        System.out.println(); // Pemisah output

        // Proses kendaraan2
        kendaraan2.tampilkanInfo();
        kendaraan2.tambahKecepatan(30); // Dari 40 jadi 70
        kendaraan2.kurangiKecepatan(40); // Dari 70 jadi 30
        kendaraan2.berhenti(); // Kecepatan menjadi 0
        kendaraan2.tampilkanInfo(); // Menampilkan info terakhir
    }
}
