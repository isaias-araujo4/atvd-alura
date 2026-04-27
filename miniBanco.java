import java.util.Scanner;

public class miniBanco {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome;
        Double saldo, valor;
        int senha, op = 0, senhaT = 0;

        System.out.println("digite nome, saldo e senha");
        nome = sc.nextLine();
        saldo = sc.nextDouble();
        senha = sc.nextInt();

        while (op != 4) {

            System.out.println("1 - consultar saldo");
            System.out.println("2 - receber valor");
            System.out.println("3 - tranferir valor");
            System.out.println("4 - sair");
            op = sc.nextInt();

            switch (op) {
                case 1:

                    System.out.println(nome);
                    System.out.println(saldo);
                    break;

                case 2:
                    System.out.println("digite o valor que vai receber");
                    valor = sc.nextDouble();
                    saldo += valor;

                    System.out.println("saldo atualizado");
                    System.out.println(nome);
                    System.out.println(saldo);
                    break;

                case 3:
                    while (senha != senhaT) {
                        System.out.println("digite o valor que deseja tranferir");
                        valor = sc.nextDouble();

                        if (valor <= saldo) {
                            System.out.println("digite sua senha");
                            senhaT = sc.nextInt();

                            if (senha == senhaT) {
                                saldo -= valor;
                                System.out.println("saldo atualizado");
                                System.out.println(nome);
                                System.out.println(saldo);
                            } else {
                                System.out.println("senha incorreta, tente novamente");
                            }
                        } else {
                            System.out.println("saldo insuficiente");
                        }
                    }
                    break;

                case 4:
                    System.out.println("adeus");
                    break;
                default:
                    System.out.println("opção invalida");
                    break;
            }

        }

        sc.close();
    }

}
