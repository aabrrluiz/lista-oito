package EX7;

public class bichinho {
        private String nome;
        private int fome;
        private int saude;
        private int idade;

        public String getNome() {
            return nome;
        }
        
        public void setNome(String nome) {
            this.nome = nome;
        }
        
        public int getFome() {
            return fome;
        }
        
        public void setFome(int fome) {
            this.fome = fome;
        }
        
        public int getSaude() {
            return saude;
        }
        
        public void setSaude(int saude) {
            this.saude = saude;
        }
        
        public int getIdade() {
            return idade;
        }
        
        public void setIdade(int idade) {
            this.idade = idade;
        }
        
        public float humor() {
            return fome * saude;
        }
        public void imprimirInformações(){
            System.out.println("Nome: " + nome);
            System.out.println("Fome: " + fome);
            System.out.println("Saúde: " + saude);
            System.out.println("Idade: " + idade);
            System.out.println("Humor: " + humor());
        }
    }
