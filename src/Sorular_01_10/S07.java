package Sorular_01_10;

import java.util.Scanner;

public class S07 {
    public static void main(String[] args) {
        /*
        Soru 7-)
        Kullanicidan Double türünde bir sayi alin. Alinan bu sayiyi tam sayiya cevirerek konsolda yazdirin.
        (Istege bagli) Float degerinde bir sayi alin bu sayiyi da short degisken türünde bir sayiya döndürün
        ipuclari:
        Data Casting konusuna bakiniz. Auto Widening ve Explicit Narrowing konularini hatirlayalim.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz: ");
        double sayi = scan.nextDouble();

        int sayiCast = (int)sayi;
        System.out.println("Girdiginiz sayının tam sayı hali : "+sayiCast);


        System.out.println("=====================2.cözüm======================");

        System.out.println("Lütfen float türünde bir sayı girin: ");
        float deger=scan.nextFloat();
        short sayiS= (short)deger;
        System.out.println("Girdiginiz sayının en son hali : " + sayiS);
    }
}
