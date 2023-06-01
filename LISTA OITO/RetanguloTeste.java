package EX3;
import java.util.Scanner;
public class RetanguloTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();
        System.out.println("\nPor favor, informe a largura do local desejado: ");
        Double Largura = scanner.nextDouble();
        System.out.println("\nPor favor, informe o comprimento do local desejado: ");
        Double Comprimento = scanner.nextDouble();
        retangulo.mudarValorComprimento(Comprimento);
        retangulo.mudarValorLargura(Largura);
        System.out.println("\nPor favor, informe o comprimento dos pisos");
        Double ComprimentoPiso = scanner.nextDouble();
        System.out.println("\nPor favor, informe a largura dos pisos");
        Double LarguraPiso = scanner.nextDouble();
        System.out.println("Informe a altura do rodapé: ");
        Double AlturaRodape = scanner.nextDouble();
        retangulo.mudarValorComprimentoPiso(ComprimentoPiso);
        retangulo.mudarValorLarguraPiso(LarguraPiso);
        retangulo.mudarValorAlturaRodape(AlturaRodape);
        retangulo.calcularArea();
        retangulo.calcularAreaPiso();
        retangulo.calcularPerimetro(Largura, Comprimento);
        retangulo.calcularQuantidadeDePisos();
        retangulo.calcularQuantidadeDeRodapes();
        retangulo.ImprimirValores();
        scanner.close();
    }
    
}


