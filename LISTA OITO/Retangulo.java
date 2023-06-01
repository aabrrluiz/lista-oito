package EX3;
public class Retangulo {
    Double comprimento;
    Double largura;
    Double area;
    Double perimetro;
    Double comprimentoPiso;
    Double larguraPiso;
    Double alturaRodape;
    Double areaPiso;
    Double areaRodape;
    Double quantidadeDePiso;
    Double quantidadeDeRodapes;

    public Double mudarValorComprimento (Double comprimento){
        this.comprimento = comprimento;
        return comprimento;
    }
    public Double mudarValorLargura (Double largura){
        this.largura = largura;
        return largura;
    }
    public Double calcularPerimetro(Double largura, Double comprimento){
        perimetro = (comprimento * 2) + (largura * 2);
        return perimetro;
    }
    public Double calcularArea (){
        area = comprimento * largura;
        return area;
    }
    public Double calcularAreaPiso(){
        areaPiso = comprimentoPiso * larguraPiso;
        return areaPiso;
    }   
    public Double mudarValorComprimentoPiso (Double comprimentoPiso){
        this.comprimentoPiso = comprimentoPiso;
        return comprimentoPiso;
    }
    public Double mudarValorLarguraPiso (Double larguraPiso){
        this.larguraPiso = larguraPiso;
        return larguraPiso;
    }
    public Double mudarValorAlturaRodape(Double alturaRodape){
    this.alturaRodape = alturaRodape;
    return alturaRodape;
    }
    public Double calcularQuantidadeDeRodapes(){
        areaRodape = perimetro * alturaRodape;
        quantidadeDeRodapes = Math.ceil((areaRodape/areaPiso));
        return quantidadeDeRodapes;
    }
    public Double calcularQuantidadeDePisos (){
        quantidadeDePiso = Math.ceil((area/areaPiso));
        return quantidadeDePiso;
    }
    public void ImprimirValores(){
        System.out.printf("\nA largura do local informado é: %.2f", largura);
        System.out.printf("\nO comprimento do local informado é: %.2f", comprimento);
        System.out.printf("\nO perímetro do local informado é: %.2f", perimetro);
        System.out.printf("\nA quantidade de pisos que você irá precisar é de: %.0f", quantidadeDePiso);
        System.out.printf("\nA quantidade de rodapés necessários é de: %.0f", quantidadeDeRodapes);
    }

}

