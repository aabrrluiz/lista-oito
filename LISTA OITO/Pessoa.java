package EX4;

public class Pessoa {
    private String nome;
    private int idade;
    private float peso;
    private float altura;

    public void envelhecer(int anos) {
        this.idade += anos;
        if (this.idade < 21)
            crescer(0.5f);
    }

    public void engordar(float engordar) {
        this.peso = peso + engordar;
    }

    public void emagrecer(float emagrecer) {
        this.peso = peso - emagrecer;
    }

    public void crescer(float crescer) {
        this.altura = altura + (crescer/100);
    }
    public void imprimirInformaçoes() {
        System.out.println("Pessoa \nNome:" + nome + " \nIdade: " + idade + " \nPeso:" + peso + "\nAltura:" + altura);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
