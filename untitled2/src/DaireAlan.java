import java.util.Scanner;

public class DaireAlan {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Double pi=3.14;
        System.out.print("Lütfen Dairenin Yarıçapını Giriniz:");
        Double r= scan.nextDouble();
        System.out.print("Kaç Derecelik Bir Daire Diliminin Alanını Bulmak İstediğinizi Giriniz:");
        Double a= scan.nextDouble();
        Double F=pi*(r*r)*(a/360);
        System.out.println("Alan:" + F);
    }
}
