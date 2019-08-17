package pertemuan2;

import java.util.Scanner;

public class DataKaryawan {

    public static void main(String[] args) {
        // deklarasi variabel
        String nama, alamat;
        int usia, gaji;

        // membuat scanner baru
        Scanner keyboard = new Scanner(System.in);

        // Tampilkan output ke user
        System.out.println("### Pendataan Karyawan PT.Petani Kode ###");
        System.out.println("Nama Karyawan : ");
        // menggunakan scanner dan menyimpan apa yang diketik di variabel nama
        nama = keyboard.nextLine();
        // Tampilkan output lagi
        System.out.println("Alamat : ");
        // menggunakan scanner lagi
        alamat = keyboard.nextLine();

        System.out.println("Usia : ");
        usia = keyboard.nextInt();

        System.out.println("Gaji : ");
        gaji = keyboard.nextInt();

        // Menampilkan apa yang sudah disimpan di variabel
        System.out.println("---------------------------");
        System.out.println("Nama karyawan : " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Gaji: Rp. " + gaji);
    }
}
