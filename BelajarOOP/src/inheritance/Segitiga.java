package inheritance;

public class Segitiga extends BangunDatar {

    float alas;
    float tinggi;

    @Override
    float luas() {
        float luas = alas * tinggi;
        System.out.println("Luas Segitiga: " + luas);
        return luas;
    }

}
