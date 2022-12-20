import java.util.Scanner;

public class Kdv {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Double amount , vat=0.18;
        System.out.print("Please Enter Amount");
        amount=scan.nextDouble();
        if (amount>=0 && amount<=1000){
            Double vatamount=amount+(amount*vat);
            Double vatt=amount*vat;
            System.out.println("Normal Amount:" + amount + "\n" + "Amount İncluding Vat" + vatamount + "\n" + "Vat Amount:" + vatt );
        } else if (amount > 1000) {
            vat=0.08;
            Double vatamount=amount+(amount*vat);
            Double vatt=amount*vat;
            System.out.println("Normal Amount:" + amount + "\n" + "Amount İncluding Vat" + vatamount + "\n" + "Vat Amount:" + vatt );

        }

    }
}
