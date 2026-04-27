package hora_da_pratica;

import java.util.Scanner;

public class atvd1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("digite um número");
        int n = sc.nextInt();
        
        if (n > 0) {
            System.out.println("o número é positivo");
        }else{
            System.out.println("o número é negativo");
        }
       
        sc.close();
    }

}
