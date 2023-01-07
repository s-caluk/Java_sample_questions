package Sorular_01_10;

public class S01 {
    public static void main(String[] args) {
    /*
    Soru 1-)   SOUT/SYSO
    Dairenin alanini ve cevresini hesaplayan java kodu yaziniz.
    Ipuclari:
    * r=7;
    * Pi=3.14
    * Dairenin Cevresi : 2*Pi*r
    * Dairenin Alani : Pi*r*r
    */

        double r = 7 ;
        double Pi = 3.14 ;
        double daireninCevresi = (2*Pi*r);
        double daireninAlani = (Pi*r*r);

        System.out.println(daireninCevresi);
        System.out.println(daireninAlani);

        System.out.println("==============2.cözüm===============");

        double r2=7;
        double cevre= Math.PI*2*r2;
        System.out.println("Dairenin cevresi: "+cevre);
        double alan= Math.PI*r2*r2;
        System.out.println("Dairenin alani : "+alan);

    }
}
