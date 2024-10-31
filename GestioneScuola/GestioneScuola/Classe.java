package GestioneScuola;

public class Classe {
    private String nome;
    private Studente[] studenti;

    private Scuola scuolaAppartenzea;

    private int studentiClasse;

    public Classe(String nome) {
        this.nome = nome;
        this.studenti = new Studente[30];
        studentiClasse = 0;
    }

    // Returns true if student is added successfully


    public boolean aggiungiStudente(Studente s) {
        if (studentiClasse < 30) {
            s.aggiungiClasse(this);
            studenti[studentiClasse] = s;
            studentiClasse++;
            return true;
        }
        return false;
    }

    public void setScuolaAppartenzea(Scuola scuolaAppartenzea) {
        this.scuolaAppartenzea = scuolaAppartenzea;
    }

    public void visualizzaStudente(int id){
        if(id>=0&&id<=studentiClasse){
            System.out.println("Nome: " +studenti[id].getNome() + "Cognome: " + studenti[id].getCognome() + "CF: " + studenti[id].getCF());
        }
        else{
            System.out.println("ID NON VALDIO");
        }
    }

    public void visualizzaClasse(){
        for(int i=0; i<studentiClasse; i++){
            System.out.println("Nome: " +studenti[i].getNome() + "Cognome: " + studenti[i].getCognome() + "CF: " + studenti[i].getCF());
        }
    }

    public String toString(){
        return this.nome + " " + this.studentiClasse;
    }
    
    //Il toString convere un oggetto in stringa!
    //è un metodo che può essere chiamato implicitamente ed esplicitamente.
}
