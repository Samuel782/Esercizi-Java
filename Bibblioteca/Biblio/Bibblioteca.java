package Biblio;

public class Bibblioteca {
    private Piano[] pianiInBibblioteca;

    public Bibblioteca() {
        pianiInBibblioteca = new Piano[3];
        for (int i = 0; i < pianiInBibblioteca.length; i++) {
            pianiInBibblioteca[i] = new Piano();
        }
    }

    public boolean contiene(int iPiano, int iScaffale, int iRipiano){
        return  pianiInBibblioteca[iPiano].contiene(iScaffale, iRipiano);
    }

    public Piano getPiano(int iPiano) {
        return pianiInBibblioteca[iPiano];
    }

    public boolean cerca(String nome, String autore) {
        for (int i = 0; i < pianiInBibblioteca.length; i++) {
            if(pianiInBibblioteca[i].cerca(nome, autore)) return true;
        }
        return false;
    }
}
