import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner contaBancaria = new Scanner(System.in);
      
        System.out.print("Digite seu nome: ");
        String nome = contaBancaria.next();

        System.out.print("Digite sua agência (xxx-x): ");
        String agencia = contaBancaria.next();
        
        System.out.print("Digite o número de sua conta (xxxx): ");
        int numeroConta = contaBancaria.nextInt();


        System.out.print("Digite o saldo de sua conta: ");
        double saldo = contaBancaria.nextDouble();

        System.out.println("Olá" + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + "e seu saldo " + saldo + " já está disponível para saque");

        contaBancaria.close();
    }
}
