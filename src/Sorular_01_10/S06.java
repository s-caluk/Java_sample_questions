package Sorular_01_10;
import java.util.Scanner;
public class S06 {
    public static void main(String[] args) {
        /*
        Soru 6-)  Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun.
        Yılda kaç çay içtigini ve kaç kg şeker kullandığını hesaplayın ve bunları ekranda yazdırın.
        1 şeker = 1.5 gr
        1 kg = 1000 gram      olarak hesaplayın.

        Ipuclari:
·       Önce gram cinsinden yıllık ne kadar seker kullandıgını bulun ve kiloya çevirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Günde ne kadar çay içiyorsunuz? ");
        int cay=scan.nextInt();
        System.out.println("Ne kadar seker kullanıyorsunuz? ");
        int seker=scan.nextInt();

        double userGram = (365*cay*seker*1.5) ;
        double toplamKilo = (userGram/1000) ;

        System.out.println("Yilda " + toplamKilo + " kg seker kullaniyor.");
        System.out.println( "Yilda " + (cay*365) + " bardak cay içiyorsun." + "Çok fazla ağam biraz azalt :-)" );


    }
}
