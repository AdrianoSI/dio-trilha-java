

import java.util.Scanner;
public class SimulacaoBancaria {

  

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        double valor;
        boolean continuar = true;
    
     
        while (continuar) {
    
            int opcao = scanner.nextInt();              
    
            switch (opcao) {          
    
        
                case 1:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                
                 //System.out.println("Informe o valor a ser depositado!");
                     saldo= scanner.nextDouble();
                 //saldo= saldo + valor;
                    System.out.println("o valor do saldo é:"+ saldo);
    
                    
                    break;
                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                  //  System.out.print("Quanto deseja sacar: ");
                    saldo= scanner.nextDouble();
    
                         if(saldo <= saldo){  
                           // saldo =saldo-valor; 
                           
                         //   System.out.println("o saldo disponivel para saque é:"+ saldo);
                    //    } else{
                            System.out.println("Saldo insuficiente para saque.\n");
                        } 
    
                        break;
                   
                case 3:
               
                    System.out.println("O seu saldo atualizado é:\n"+saldo);
                
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    
              }
                  }
                    
                    scanner.close();

            
}
}

    

