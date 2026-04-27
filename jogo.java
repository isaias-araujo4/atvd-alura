import java.util.Scanner;
import java.util.Random;

public class jogo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nTentativa, nEscolhido = new Random().nextInt(101), tentativa = 1;

        System.out.println("tente adivinhar o número escolhido de 1 a 100, vc tem 5 chances");

        for (int i = 0; i < 5; i++) {

            System.out.println("tente acertar");
            nTentativa = sc.nextInt();
            System.out.println("tentativa: " + tentativa);
            tentativa++;

            if (nTentativa != nEscolhido) {

                if (nTentativa > nEscolhido) {
                    System.out.println("errou");
                    System.out.println("o número é menor que: " + nTentativa);
                } else {
                    System.out.println("errou");
                    System.out.println("o número é maior que: " + nTentativa);
                }

                if (i == 4) {
                    System.out.println("perdeu, o número é: " + nEscolhido);
                }
            } else {
                System.out.println("acertou o número é: " + nEscolhido);
                System.out.println("números de chances: " + tentativa);
                break;
            }

        }

        sc.close();
    }
}