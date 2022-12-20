import java.util.Scanner;

public class Endeks {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Boyunuzu Giriniz (Metre Cinsinden):");
        Double boy= scan.nextDouble();
        System.out.println("Lütfen Kilonuzu Giriniz (Kilogram Olarak):");
        Double k= scan.nextDouble();
        Double a=k/(boy*boy);
        System.out.println("Vücut Kitle Endeksiniz="+a);

    }
}
