import java.util.Scanner;
public class Main {


    static int rekursifUslu(int taban, int us) {
        if (taban == 0) {
            return 0;
        }
        if (us == 1 ) {
            return taban;
        }
        return taban * rekursifUslu(taban,us-1) ;

    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Taban değerini giriniz : ");
        int taban = inp.nextInt();
        System.out.println("Üs değerini giriniz : ");
        int us = inp.nextInt();
        System.out.println(rekursifUslu(taban,us));
    }
}
