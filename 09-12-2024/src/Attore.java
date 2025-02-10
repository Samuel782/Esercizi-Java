public class Attore {
    private String nome;
    private String cognome;
    private String cf;

    public Attore(String nome, String cognome, String cf) {
        this.nome = nome;
        this.cognome = cognome;
        this.cf = cf;
    }

    public String getCf() {
        return this.cf;    
    }

}
