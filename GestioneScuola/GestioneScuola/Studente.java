package GestioneScuola;

public class Studente {
    private String nome;
    private String cognome;
    private String codiceFiscale;

    private Classe classeDiAppartenenza;
    
    public Studente(String nome,String cognome,String codiceFiscale){
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
    }

    public void aggiungiClasse(Classe c){
        this.classeDiAppartenenza=c;
    }

    public String getNome(){
        return this.nome;
    }
    public String getCognome(){ 
        return this.cognome;
    }
    public String getCF(){
        return this.codiceFiscale;
    }
    
}
