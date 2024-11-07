package Biblio;

public class Libro {

    private String titolo;
    private String autore;

    private Ripiano ripianoDiAppartenenza;

    public Libro(String titolo, String autore, Ripiano ripianoDiapp) {
        this.titolo = titolo;
        this.autore = autore;
        this.ripianoDiAppartenenza = ripianoDiapp;
    }

    public String getAutore() {
        return autore;
    }

    public String getTitolo() {
        return titolo;
    }

    public Ripiano getRipiano() {
        return ripianoDiAppartenenza;
    }

    public Scaffale getScaffale() {
        return getRipiano().getScaffaleDiAppartenza();
    }

    public Piano getPiano() {
        return getRipiano().getScaffaleDiAppartenza().getPianoDiAppartenenza();
    }

    @Override
    public String toString() {
        return titolo + ", " + autore;
    }
}