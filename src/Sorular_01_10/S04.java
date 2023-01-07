

package Sorular_01_10;
import java.util.Scanner;
public class S04 {
    public static void main(String[] args) {
        /*
        Soru 4-)   SCANNER
        Kullanıcıdan bir sayı alın ve aldiginiz bu sayının küpünün yarısını konsola yazdırin.
        Ipuclari:
        * Sayinin küpü: sayi*sayi*sayi
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: \n");
        int sayi=scan.nextInt();
        System.out.println("Sayinin küpünün yarisi: " + (sayi*sayi*sayi)/2);

    }
}
