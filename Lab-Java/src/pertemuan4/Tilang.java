package pertemuan4;

public class Tilang {
    public static void main(String[] args) {
        boolean SIM = true;
        boolean STNK = true;

        // cek apakah dia akan ditilang atau tidak
        if(SIM == true && STNK == true){
            System.out.println("Anda tidak ditilang!");
        } else {
            System.out.println("Anda ditilang!");
        }
    }
}