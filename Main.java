// Die throw between two players

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Die d1, d2;
        int sum;
        d1=new Die();
        d2=new Die();

        Scanner m = new Scanner(System.in);
        System.out.println("Spiler 1 kaster terninger");
        String n=m.nextLine();
        System.out.print(n);


        d1.roll();
        d2.roll();
        sum=d1.roll()+ d2.roll();
        System.out.println("D1:" +d1+ "; D2:" + d2);
        System.out.println("sum:" +sum);
    }

}
