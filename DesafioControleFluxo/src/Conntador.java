import java.util.Scanner;

public class Conntador {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Variaveis
        int n1;
        int n2;
        
        //Entrada dos dados
        System.out.println("Informe o primeiro numero:");
            n1 = input.nextInt();
            input.nextLine();

        System.out.println("Informe o segundo numero:");
            n2 = input.nextInt();
            System.out.println("\n------------------");
            //Validando a impressao
            try {
                contar(n1, n2);
                for(int i=n2; i > n1; i--){

                 int   cont = i -n1;
                   
                    System.out.println("\n A sequência dos numeros é:"+ cont);
                }
            } catch (ParametrosInvalidosException e) {
                // TODO Auto-generated catch block
                System.out.println("O Segundo numero não pode ser menor que o primeiro numero!");
            }

    }
    //Lançando a exeção
    static void contar ( int n1, int n2)throws ParametrosInvalidosException{

        if (n2 <= n1 ){

        throw new ParametrosInvalidosException();    
                

        }  
            

    }
    
}
