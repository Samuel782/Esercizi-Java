package Biblio;

public class Ripiano {
    private Libro[] libriInRipiano;

    private Scaffale scaffaleDiAppartenza;

    public Ripiano(Scaffale scaffaleDiApp) {
        libriInRipiano = new Libro[10];
        this.scaffaleDiAppartenza = scaffaleDiApp;
    }

    public boolean contiene() {
        for (int i = 0; i < libriInRipiano.length; i++) {
            if (libriInRipiano[i] != null) {
                return true;
            }
        }
        return false;
    }

    public String getLibriInRipiano() {
        String retValue = "";
        for (int i = 0; i < libriInRipiano.length; i++) {
            retValue += libriInRipiano[i] + ", ";
        }
        return retValue;
    }
    
    public Scaffale getScaffaleDiAppartenza() {
        return scaffaleDiAppartenza;
    }



    public boolean cerca(String nome, String autore){
        for(int i=0; i<libriInRipiano.length; i++){
            if(libriInRipiano[i].getTitolo()==nome && libriInRipiano[i].getAutore()==autore) return true;
        }
        return false;
    }
}
