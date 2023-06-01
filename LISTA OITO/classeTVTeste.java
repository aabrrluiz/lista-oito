package EX6;
import java.util.Scanner;
public class classeTVTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        classeTV tv = new classeTV();
        System.out.println("Informe o canal que deseja sintonizar: ");
        int numeroCanal = scanner.nextInt();
        if (numeroCanal <= 100){
        tv.setNumeroCanal(numeroCanal);
        tv.canalAtual();
        System.out.println("Informe o volume inicial da TV: ");
        int volume = scanner.nextInt();
        tv.setVolume(volume);
        tv.volumeAtual();
        System.out.println("Deseja aumentar ou diminuir o volume?");
        String desejo = scanner.next().toUpperCase();
        switch (desejo){
            case "AUMENTAR":
            System.out.println("Quanto você deseja aumentar o volume? ");
            int aumentarVolume = scanner.nextInt();
            if (aumentarVolume <= 100){
                if (volume >= 100){
                    tv.setVolume(100);
                } else{
                tv.setAumentarVolume(aumentarVolume);
                tv.aumentarVolume(volume, aumentarVolume);
                }
                tv.volumeAtual();
                }
                break;
            case "DIMINUIR":
            System.out.println("Quanto você deseja diminuir o volume? ");
            int diminuirVolume = scanner.nextInt();
            if (diminuirVolume >= 1){
                if (volume <= 0){
                    tv.setVolume(0);
                } else{
                tv.setDiminuirVolume(diminuirVolume);
                tv.diminuirVolume(volume, diminuirVolume);
                }
                tv.volumeAtual();
                }
                break;
            default:
                System.out.println("Opção inválida, o volume continuará o mesmo!");
                break;
            
        }
        } else{
            System.out.println("Número do canal inválido!");
        }
        scanner.close();
    }
}
