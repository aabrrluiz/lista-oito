package EX1;

public class Bola {
    private String cor;
    private Double circunferencia;
    
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public Double getCircunferencia() {
        return circunferencia;
    }
    public void setCircunferencia(Double circunferencia) {
        this.circunferencia = circunferencia;
    }
    public String trocaCor (String cor){
        this.cor = cor;
        return null;
    }
    void mostraCor (String cor){
        System.out.println("A cor da bola é: " + cor);    
    }
}

    

