import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {


   public static void main(String[] args) {

    
    Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    

     System.out.println("Por favor,digite o número da sua agencia! ");
        int agencia = sc.nextInt();

    System.out.println("Digite o número da conta! ");
        int conta = sc.nextInt();

    System.out.println("Digite seu nome! ");
        String nome = sc.next();

    System.out.println("Qual valor do depósito? ");
        double saldo = sc.nextDouble();

    System.out.printf("Olá " + nome +", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia +", conta " + conta + 
    " e seu saldo de %.2f Reais%n já está disponível para saque.", saldo );

  



   }
}
