package Sorular_01_10;

import java.util.Scanner;

public class S05 {
    public static void main(String[] args) {
        /*
        Soru 5-)   SCANNER
        Kullanıcıdan karenin kenar uzunluğunu alın. Aldiginiz uzunluklarla karenin alanını ve çevresini hesaplayan kodu yazın.
        Ipuclari:
        Google yaparak karenin alaninin ve cevresinin nasil bulundugunu ögrenin :-)
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen karenin kenar uzunlugunu giriniz");
        int kenar = scan.nextInt();

        System.out.println("Alan: "+kenar*3);
        System.out.println("Cevre: "+kenar*4);

    }
}
