

package Sorular_01_10;
import java.util.Scanner;

public class S04_ek {
    public static void main(String[] args) {

        //Kullanıcıdan bir harf isteyin.
        //Kullanıcı birden fazla harf girerse ilk harfin alınmasını sağlayın. (Ö,İ,Ü işleme alınmasın)
        //Ayrıca girilen harfte büyük küçük olmasını göz ardı edin.
        //Harf sesli harf ise harf sesli bir harftir, değilse girilen harf sesli harf değildir yazdırın.

        Scanner scan= new Scanner(System.in);
        System.out.println("harf giriniz");
        char harf= scan.next().charAt(0);

        if (harf=='Ö')System.out.println("islem gecersiz");
        if (harf=='İ' )System.out.println("islem gecersiz");
        if (harf=='Ü' )System.out.println("islem gecersiz");

        if (harf>'a' && harf<'z') System.out.println("Kucuk harf");
        if (harf>'A' && harf<'Z') System.out.println("Buyuk harf");

        if (harf=='a') System.out.println("sesli harf");
        if (harf=='e') System.out.println("sesli harf");
        if (harf=='i') System.out.println("sesli harf");
        if (harf=='u') System.out.println("sesli harf");
        if (harf=='o') System.out.println("sesli harf");
        else System.out.println("sesli harf degil");

        System.out.println("==================2.cözüm/mit char=======================");

        //Scanner scan = new Scanner(System.in);
        System.out.println("harf giriniz");
        char harf2 = scan.next().toUpperCase().charAt(0);

        if (harf2>='A' && harf2<= 'Z'){
            if(harf2=='A'|| harf2=='E'|| harf2=='I'|| harf2=='O'|| harf2=='U')
                System.out.println("sesli harf");
            else System.out.println("sesli harf değildir");}
        else System.out.println("geçersiz giriş");

        /*

        System.out.println("==================3.cözüm/mit substring=======================");

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir harf giriiniz");
        String harf3 = scan.nextLine().toUpperCase();
        String sesliHarf = "AEIOU";
        String harfler ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        if (!harfler.contains(harf3.substring(0,1))) System.out.println("geçersiz giriş");
        else {
            if (sesliHarf.contains(harf3.substring(0,1))) System.out.println("sesli harf");
            else System.out.println("sesli harf değildir");
        }

        */

    }
}
