package EX2;
import java.util.Scanner;
public class QuadradoTeste {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Quadrado quadrado = new Quadrado();
        System.out.println("Por favor, digite o lado do quadrado: ");
        Double tamanhoLado = scanner.nextDouble();
        quadrado.setTamanhoLado(tamanhoLado);
        quadrado.retornarLado(tamanhoLado);
        quadrado.calcularArea(tamanhoLado);
        scanner.close();
    }
}

