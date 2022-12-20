import java.util.Scanner;

public class Market {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Kaç Kilo Armut Almak İstediğinizi Giriniz:");
        Double a= scan.nextDouble();
        System.out.print("Kaç Kilo Elma Almak İstediğinizi Giriniz:");
        Double b= scan.nextDouble();
        System.out.print("Kaç Kilo Domates Almak İstediğinizi Giriniz:");
        Double c= scan.nextDouble();
        System.out.print("Kaç Kilo Muz Almak İstediğinizi Giriniz:");
        Double d= scan.nextDouble();
        System.out.print("Kaç Kilo Patlıcan Almak İstediğinizi Giriniz:");
        Double e= scan.nextDouble();
        Double toplam=((a*2.14)+(b*3.67)+(c*1.11)+(d*0.95)+(5*e));
        System.out.print("Toplam Tutar:" + toplam + "TL");
    }
}
