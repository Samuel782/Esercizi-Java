public class Proprietario {
    private String nome;
    private String cognome;
    private String cf;

    public Proprietario(String nome, String cognome, String cf) {
        this.nome = nome;
        this.cognome = cognome;
        this.cf = cf;
    }

    public String getCf() {
        return cf;
    }
}
