package pertemuan2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ContohBufferedReader {

    public static void main(String[] args) throws IOException {

        String nama;

        // Membuat objek inputstream
        InputStreamReader isr = new InputStreamReader(System.in);

        // Membuat objek bufferedreader
        BufferedReader br = new BufferedReader(isr);

        // Mengisi variabel nama dengan BufferedReader
        System.out.println("Inputkan nama: ");
        nama = br.readLine();

        // Tampilkan output isi variabel nama
        System.out.println("Nama kamu adalah " + nama);

    }
}
