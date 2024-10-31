package GestioneScuola;

public class Scuola {
    private String nome;
    private Classe[] classi;
    private int numClassi;

    public Scuola(String nome, int maxClassi){
        this.nome = nome;
        classi = new Classe[maxClassi];

        this.numClassi=0;
    }

    //Returns true if a classroom is added succesfuly, it returns false otherwise
    public boolean aggiungiClasse(Classe classe){
        if(this.classi.length > this.numClassi){
            classe.setScuolaAppartenzea(this);
            this.classi[this.numClassi] = classe;
            this.numClassi++;
            return true;
        }
        return false;
    }

    

}
