package EX5;
import java.util.Scanner;
public class contaCorrenteTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome do titular da conta: ");
        String nomeDoCorrentista = scanner.next();
        System.out.println("Informe o número da conta: ");
        int numeroDaConta = scanner.nextInt();
        System.out.println("Informe o saldo da conta do titular: ");
        Double saldo = scanner.nextDouble();
        contaCorrente conta = new contaCorrente(nomeDoCorrentista, numeroDaConta, saldo);
        conta.setNomeDoCorrentista(nomeDoCorrentista);
        conta.setNumeroDaConta(numeroDaConta);
        conta.setSaldo(saldo);
        conta.mostrarInformações();
        scanner.close();
    }
}