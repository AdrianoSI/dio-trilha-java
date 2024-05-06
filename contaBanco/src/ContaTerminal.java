import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) {
      
        try (Scanner scanner = new Scanner(System.in)) {
            String cliente;
            String agencia;
            int   conta;
            double saldo;

                System.out.println("Digite o nome do cliente! \n");
                cliente = scanner.nextLine();
                scanner.nextLine();

                System.out.println("Digite o numero da agencia! \n");
                agencia = scanner.next();
                scanner.nextLine();


                System.out.println("Digite o numero da conta! \n");
                conta = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Digite o valor do saldo! \n");
                saldo = scanner.nextDouble();
                scanner.nextLine();



                System.out.printf("Olá " + cliente + "  obrigado por realizar a abertura da conta em nosso banco, a sua agencia é\n"+ "Agencia %s\n Conta %d\n Saldo %8.2f"+ " \"Saldo disponivel para saque\"", agencia, conta, saldo);
        }
               


    }
}
