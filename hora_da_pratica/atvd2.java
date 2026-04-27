package hora_da_pratica;

import java.util.Scanner;

public class atvd2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1, n2;

        System.out.println("digite 2 números");
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        if (n1 == n2) {
            System.out.println("são iguais");
        } else if (n1 > n2) {
            System.out.println("diferente ");
            System.out.println( n1 + " é maior que: " + n2);
        } else {
            System.out.println("diferente ");
            System.out.println( n2 + " é maior que: " + n1);
        }

         sc.close();
    }
}
