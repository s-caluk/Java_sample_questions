package Sorular_01_10;

import java.util.Scanner;

public class S08 {
    public static void main(String[] args) {

        /*
        Soru-8)
        Kullanicidan üc basamaklı bir sayı alin.
        Kullanicidan alinan bu sayinin basamaklari toplamini ekranda yazdirin.
        ipuclari:
        Matematiksel Islemler konusuna bakalim. Bölme islemi kullanarak sayinin basamaklarini alalim
        ve toplam adli bir konteynira (Variable) atalim
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 3 basamakli sayi giriniz");
        int sayi=scan.nextInt();
        int toplam=0;

        toplam+=sayi%10;    //birler basamagini veriyor bsp:234 , toplam 4
        sayi=sayi/10;       // sayi = 23 oldu
        toplam+=sayi%10;    // toplam = 7 oldu
        sayi=sayi/10;       // sayi = 2 oldu
        toplam+=sayi%10;    // toplam = 9 oldu
        sayi=sayi/10;       // sayi = 0 oldu
        toplam+=sayi;

        System.out.println("Verilen sayinin rakamlari toplami " + toplam + "'dur.");

        System.out.println("\n=============2.cözüm==================\n");

        int input=1453;
        int birlerBasamagi=0;
        int rakamlarToplami=0;

        for (int i = 1; i <=4 ; i++) {
            birlerBasamagi=input%10;
            rakamlarToplami+=birlerBasamagi;
            input=input/10;
        }
        System.out.println("rakamlarToplami = " + rakamlarToplami);
    }
}
