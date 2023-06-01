package EX6;

public class classeTV {
    private int numeroCanal;
    private int volume;
    private int aumentarVolume;
    private int diminuirVolume;
    
    public int getNumeroCanal() {
        return numeroCanal;
    }
    public void setNumeroCanal(int numeroCanal) {
        this.numeroCanal = numeroCanal;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public int getAumentarVolume() {
        return aumentarVolume;
    }
    public void setAumentarVolume(int aumentarVolume) {
        this.aumentarVolume = aumentarVolume;
    }
    public int getDiminuirVolume() {
        return diminuirVolume;
    }
    public void setDiminuirVolume(int diminuirVolume) {
        this.diminuirVolume = diminuirVolume;
    }
    public int aumentarVolume(int volume, int aumentarVolume){
        this.volume = volume + aumentarVolume;
        return volume;
    }
    public int diminuirVolume(int volume, int diminuirVolume){
        this.volume = volume - diminuirVolume;
        return volume;
    }
    public void volumeAtual(){
    System.out.println("O volume atual é: " + volume);
    }
    public void canalAtual(){
    System.out.println("O canal atual é: " + numeroCanal);
    }

}
