package pertemuan2;

import java.util.Scanner;

public class LuasSegitiga {

    public static void main(String[] args) {
        // deklarasi
        Double luas;
        int alas, tinggi;

        // membuat scanner baru
        Scanner baca = new Scanner(System.in);

        // Input
        System.out.println("== Program hitung luas Segitiga ==");
        System.out.println("Input alas: ");
        alas = baca.nextInt();
        System.out.println("Input tinggi: ");
        tinggi = baca.nextInt();

        // proses
        luas = Double.valueOf((alas * tinggi) / 2);

        // output
        System.out.println("Luas = " + luas);
    }
}
