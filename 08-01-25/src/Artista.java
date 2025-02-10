
public class Artista {
    private String cf;
    private String nome;
    private String cognome;

    public Artista(String cf, String nome, String cognome) {
        this.cf = cf;
        this.nome = nome;
        this.cognome = cognome;
    } 
    
    public String getCf() {
        return cf;
    }

    @Override
    public String toString() {
        return nome + " " + cognome + " " + cf;
    }
}