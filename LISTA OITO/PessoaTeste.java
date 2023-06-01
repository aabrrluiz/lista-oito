package EX4;
import java.util.Scanner;
public class PessoaTeste {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome da pessoa: ");
        String nome = scanner.next();
        pessoa.setNome(nome);
        System.out.println("Informe a idade dessa pessoa: ");
        int idade = scanner.nextInt();
        pessoa.setIdade(idade);
        System.out.println("Informe o peso da pessoa: ");
        float peso = scanner.nextFloat();
        pessoa.setPeso(peso);
        System.out.println("Informe a altura dessa pessoa: ");
        float altura = scanner.nextFloat();
        pessoa.setAltura(altura);
        System.out.println("Quantos anos se passaram? ");
        int anos = scanner.nextInt();
        pessoa.envelhecer(anos);
        System.out.println("Quantos quilos engordou?");
        float engordar = scanner.nextFloat();
        pessoa.engordar(engordar);
        System.out.println("Quantos quilos emagreceu? ");
        float emagrecer = scanner.nextFloat();
        pessoa.emagrecer(emagrecer);
        System.out.println("Quantos centímetros cresceu? ");
        float crescer = scanner.nextFloat();
        pessoa.crescer(crescer);
        pessoa.imprimirInformaçoes();
        scanner.close();

    }
}