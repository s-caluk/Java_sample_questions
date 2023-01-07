package Sorular_01_10;
import java.util.Scanner;

public class S03 {
    public static void main(String[] args) {
      /*
    Soru 3-)   SCANNER
    Kullanicidan 5 tane sayi alin,alinan bu sayilarin ortalamasini hesaplayan java kodunu yaziniz.
    Ipuclari:
    * Sayilarin ortalamasi: toplam/5
     */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen art arda beş sayı giriniz: \n");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        int d=scan.nextInt();
        int e=scan.nextInt();
        System.out.println("Sayilarin Ortalamasi : " + (a + b + c + d + e) / 5);

    }

}
