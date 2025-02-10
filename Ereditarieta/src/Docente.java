public class Docente extends Persona {
    private double stipendio;

    public Docente(String nome, String cognome, String cf, double stanchezza, double stipendio) {
        // richiama il costruttore della classe padre
        super(nome, cognome, cf, stanchezza);
        this.stipendio = stipendio;
        
    }

    public void insegna() {
        System.out.println("Yheee");
    }

    
}