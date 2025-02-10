public class Persona {
    private String nome;
    private String cognome;
    private String cf;
    private double stanchezza;

    public Persona(String nome, String cognome, String cf, double stanchezza) {
        this.nome = nome;
        this.cognome = cognome;
        this.cf = cf;
        this.stanchezza = stanchezza;
    }

    private void dormi(){
        this.stanchezza=0;
    }
    

}