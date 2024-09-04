import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------------------------------------------");
        System.out.println("| Por favor, digite o número da Agência! |");
        System.out.println("------------------------------------------");
        String agencia = scanner.next();
        System.out.println();

        System.out.println("-----------------------------------");
        System.out.println("| Agora digite o número da conta! |");
        System.out.println("-----------------------------------");
        int numeroDaConta = scanner.nextInt();
        System.out.println();

        System.out.println("--------------------");
        System.out.println("| Digite seu nome: |");
        System.out.println("--------------------");
        String nome = scanner.next();
        System.out.println();

        System.out.println("-------------------------");
        System.out.println("| Digite seu sobrenome: |");
        System.out.println("-------------------------");
        String sobreNome = scanner.next();
        System.out.println();

        double saldo = 15000;
        Locale ptBr = new Locale("pt", "BR");
        String coversaoMoeda = NumberFormat.getCurrencyInstance(ptBr).format(saldo);

        System.out.println("Olá " + nome + " " + sobreNome + " obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta: " + numeroDaConta + " e seu saldo de " + coversaoMoeda + " já está disponível para saque!");
    }
}
