import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        double saldo = 1000;
         
        System.out.println("seu saldo e: " + saldo);

        while (true) {

            System.out.println("1 - Ver saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");

            int opcao = teclado.nextInt();

            if (opcao == 1) {
                System.out.println("Seu saldo é: R$ " + saldo);               
            } else if (opcao == 2) {
                System.out.println("Digite o valor para depositar:");
                double valor = teclado.nextDouble();
                saldo = saldo + valor;
                System.out.println("Depósito realizado!");
            }  else if (opcao == 3) {
    System.out.println("Digite o valor para sacar:");
    double valor = teclado.nextDouble();

    if (valor <= saldo) {
        saldo = saldo - valor;
        System.out.println("Saque realizado!");
    } else {
        System.out.println("Saldo insuficiente!");
    }
               } else if (opcao == 4) {
                System.out.println("saindo...");
                break;
               }     
        }   
    }
}