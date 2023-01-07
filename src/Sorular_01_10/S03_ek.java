

package Sorular_01_10;

import java.util.Scanner;


public class S03_ek {

    public static void main(String[] args) {

        /*
        Üç sayı kabul eden ve en büyük sayıyı bulan Java programını yazınız.
            ornek:
            • Giriş:
            İlk sayı: 4
            İkinci sayi: 8
            Üçüncü sayı: 1

            • Çıktı:
            En büyük sayı: 8
         */

        int birS=10;
        int ikiS=15;
        int ucS=19;
        int buyukSayi=0;
        if(birS>ikiS && birS>ucS){
            buyukSayi=birS;
        } else if (ikiS>birS && ikiS>ucS) {
            buyukSayi=ikiS;
        }else{
            buyukSayi=ucS;
        }
        System.out.println("buyukSayi = " + buyukSayi);


        System.out.println("===========2. Cözüm=======================");


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 3 tane tam sayi giriniz");
        int ilkSayi=scan.nextInt();
        int ikinciSayi=scan.nextInt();
        int ucuncuSayi=scan.nextInt();
        if (ilkSayi>ikinciSayi && ilkSayi>ucuncuSayi){
            System.out.println("En buyuk sayi:"+ ilkSayi);
        } else if (ikinciSayi>ilkSayi && ikinciSayi>ucuncuSayi) {
            System.out.println("En buyuk sayi:"+ ikinciSayi);
        } else if (ucuncuSayi>ilkSayi && ucuncuSayi>ikinciSayi) {
            System.out.println("En buyuk sayi:"+ ucuncuSayi);
        }else
            System.out.println("Gecersiz giris");
    }
}
