package EX1;
import java.util.Scanner;
public class BolaTeste {
    public static void main(String[] args){
        Bola bola = new Bola();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, informe qual cor você deseja que seja a bola: ");
        String cor = scanner.next();
        bola.setCor(cor);
        bola.trocaCor(cor);
        bola.mostraCor(cor);
        scanner.close();
    }
}

