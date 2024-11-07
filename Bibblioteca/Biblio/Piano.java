package Biblio;

public class Piano {
    private Scaffale[] scaffaliInPiano;

    public Piano() {
        scaffaliInPiano = new Scaffale[30];
        for (int i = 0; i < scaffaliInPiano.length; i++) {
            scaffaliInPiano[i]= new Scaffale("SC" + (i+1), this);
        }
    }

    public boolean contiene(int iScaffale, int iRipiano){
        return scaffaliInPiano[iScaffale].contiene(iRipiano);
    }

    public Scaffale getScaffaleCodice(String codice){
        for(int i=0; i< scaffaliInPiano.length; i++){
            if(scaffaliInPiano[i].getCodice().equals(codice)) return scaffaliInPiano[i];
        }
        return null;
    }

    public boolean cerca(String nome, String autore) {
        for (int i = 0; i < scaffaliInPiano.length; i++) {
            if(scaffaliInPiano[i].cerca(nome, autore)) return true;
        }
        return false;
    }

}
