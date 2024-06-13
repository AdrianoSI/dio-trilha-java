import java.util.Scanner;

public class VerificarConta {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {           
    
            String numeroConta = scanner.nextLine();

            verificarNumeroConta(numeroConta);
            if (numeroConta.length()== 8){

                    System.out.println("Numero da conta valido ! ");

            }




            
        } catch (Exception e) {
            System.out.println("Informe um numero valido de 8 caractere");
        }
        
        scanner.close();
    }


    private static void verificarNumeroConta(String numeroConta)
    throws IllegalArgumentException{
        if (numeroConta.length() != 8) {
          
          
        throw new IllegalArgumentException();
            // TODO: Lançar uma IllegalArgumentException com a seguinte mensagem:
            // "Numero de conta invalido. Digite exatamente 8 digitos."
        }
    

}


}