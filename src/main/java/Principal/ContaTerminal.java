package Principal;

import exercicio.Conta;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Conta conta = new Conta();

        int opcao;

        System.out.println("Bem vindo ao seu banco! Como deseja ser chamado?");
        conta.setNomeCliente(leia.next());



        do {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar conta");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Consultar saldo");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = leia.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite o número da conta: ");
                    conta.setNumero(leia.nextInt());
                    System.out.println("Digite o número da agência: ");
                    conta.setAgencia(leia.nextInt());
                    System.out.println("Olá " + conta.getNomeCliente() + "! Obrigado por criar uma conta em nosso banco, sua agência é " +
                            + conta.getAgencia() + "seu número de conta é " + conta.getNumero() + " e seu saldo é de " +
                            conta.getSaldo());
                    break;
                case 2:
                    System.out.println("Digite valor que deseja depositar: ");
                    int valor = leia.nextInt();
                    conta.deposita(valor);
                    break;
                case 3:
                    System.out.println("Digite valor que deseja sacar: ");
                    valor = leia.nextInt();
                    conta.saca(valor);
                    break;
                case 4:
                    System.out.println("Seu saldo atual é de: " + conta.getSaldo() + " reais");
            }
        }while(opcao != 5 );
    }
}
