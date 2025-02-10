public class Studente extends Persona{
    
    private double media;

    public Studente(String nome, String cognome, String cf, double stanchezza, double media){
        //richiama il costruttore della classe padre
        super(nome, cognome, cf, stanchezza);        
        this.media = media;
    }

    public void studia(){
        System.out.println("Studio");
    }
}
