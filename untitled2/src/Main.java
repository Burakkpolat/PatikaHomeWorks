import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int math,physics,chemstiry,biology;
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter Your Math Grade:");
        math=scan.nextInt();
        System.out.println("Please Enter Your Physics Grade:");
        physics=scan.nextInt();
        System.out.println("Please Enter Your Chemstiry Grade:");
        chemstiry=scan.nextInt();
        System.out.println("Please Enter Your Biology Grade:");
        biology= scan.nextInt();
        double average=(math+physics+chemstiry+biology)/4.0;
        String s = average > 60 ? "You Passed Class" : "You Did Not Pass Class";
        System.out.println(s);
    }
    }
