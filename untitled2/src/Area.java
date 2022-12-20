import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Double a,b,c;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Side Lengths of the Triangle");
        a=scan.nextDouble();
        b=scan.nextDouble();
        c=scan.nextDouble();
        Double environtment=(a+b+c);
        Double n=(environtment/2);
        Double t=n*(n-a)*(n-b)*(n-c);
        Double Area=Math.sqrt(t);
            System.out.println("Triangle Of Area:" + Area);
    }
}
