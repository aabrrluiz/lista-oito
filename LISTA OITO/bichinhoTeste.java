package EX7;
import java.util.Scanner;
public class bichinhoTeste {
    public static void main(String[] args) {
        bichinho b = new bichinho();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome do seu bichinho: ");
        String nome = scanner.next();
        b.setNome(nome);
        System.out.println("Informe o nível de fome do bicho: ");
        int fome = scanner.nextInt();
        b.setFome(fome);
        System.out.println("Informe o nível de saúde do bicho: ");
        int saude = scanner.nextInt();
        b.setSaude(saude);
        System.out.println("Informe a idade do seu bicho: ");
        int idade = scanner.nextInt();
        b.setIdade(idade);
        b.imprimirInformações();
        scanner.close();
}
}