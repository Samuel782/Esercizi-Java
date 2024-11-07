package Biblio;

public class Scaffale {
    private String codice;
    private Ripiano[] ripianiInScaffale;

    private Piano pianoDiAppartenenza;

    public Scaffale(String codice, Piano pianoDiAppartenza) {
        ripianiInScaffale = new Ripiano[6];
        for (int i = 0; i < ripianiInScaffale.length; i++) {
            ripianiInScaffale[i] = new Ripiano(this);
        }
        this.codice = codice;

        this.pianoDiAppartenenza = pianoDiAppartenza;
    }

    public boolean contiene(int iRipiano) {
        return ripianiInScaffale[iRipiano].contiene();
    }

    public String getLibri() {
        String retValue = "";
        for (int i = 0; i < ripianiInScaffale.length; i++) {
            retValue += "Ripiano " + (i + 1) + " " + ripianiInScaffale[i].getLibriInRipiano() + "\n";
        }
        return retValue;
    }

    public String getCodice() {
        return codice;
    }
    
    public Piano getPianoDiAppartenenza() {
        return pianoDiAppartenenza;
    }

    public String getLibriInRipiano(int iRipiano) {
        return ripianiInScaffale[iRipiano].getLibriInRipiano();
    }
    
    public boolean cerca(String nome, String autore) {
        for (int i = 0; i < ripianiInScaffale.length; i++) {
            if(ripianiInScaffale[i].cerca(nome, autore)) return true;
        }
        return false;
    }
}
