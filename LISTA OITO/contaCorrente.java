package EX5;

public class contaCorrente {
    private int numeroDaConta;
    private String nomeDoCorrentista;
    private Double saldo;
    
    public contaCorrente(String nomeDoCorrentista, int numeroDaConta, Double saldo){
        this.nomeDoCorrentista = nomeDoCorrentista;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }
    public int getNumeroDaConta() {
        return numeroDaConta;
    }
    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }
    public String getNomeDoCorrentista() {
        return nomeDoCorrentista;
    }
    public void setNomeDoCorrentista(String nomeDoCorrentista) {
        this.nomeDoCorrentista = nomeDoCorrentista;
    }
    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    public String alterarNome(String nomeDoCorrentista){
        this.nomeDoCorrentista = nomeDoCorrentista;
        return nomeDoCorrentista;
    }
    public Double deposito(Double deposito){
        saldo = saldo + deposito;
        return saldo;
    }
    public Double saque(Double saque){
        saldo = saldo - saque;
        return saldo;
    }
    public void mostrarInformações(){
        System.out.println("Nome do titular da conta: " + nomeDoCorrentista);
        System.out.println("O número da conta é: " + numeroDaConta);
        System.out.println("O saldo da conta é: " + saldo + " Reais");
    }
}
