package EX2;

public class Quadrado {
    private Double tamanhoLado;

    public Double getTamanhoLado() {
        return tamanhoLado;
    }

    public void setTamanhoLado(Double tamanhoLado) {
        this.tamanhoLado = tamanhoLado;
    }
    public Double retornarLado ( Double tamanhoLado){
        System.out.println("O tamanho do lado informado é: " + tamanhoLado);
        return null;
    }
    public Double calcularArea (Double tamanhoLado){
        Double Area = Math.pow(tamanhoLado, 2);
        System.out.println("A área do quadrado informado é: " + Area);
        return null;
    }
    
}

