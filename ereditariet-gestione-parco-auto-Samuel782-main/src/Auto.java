import java.util.HashMap;

public class Auto extends Veicolo {
    /*
     * Classe derivata Auto
     * Attributi aggiuntivi:
     * numero_di_porte
     * stato_porte
     * Metodi:
     * descrizione() che sovrascrive il metodo della classe base per includere il
     * numero di porte e visualizza lo stato di tutte le porte
     * 
     * apri_porta(porta) che riceve il numero di porta e gestisce l'apertura della
     * porta (una porta può essere aperta solo se esiste e se è chiusa).
     * Visualizzare opportuni messaggi:
     * "porta aperta correttamente"
     * "porta già aperta in precedenza"
     * "porta inesistente"
     * 
     * chiudi_porta(porta) che riceve il numero di porta e gestisce la chiusura
     * della porta (una porta può essere chiusa solo se esiste e se è aperta).
     * Visualizzare opportuni messaggi:
     * "porta chiusa correttamente"
     * "porta già chiusa in precedenza"
     * "porta inesistente"
     */

    private int numeroDiPorte;
    private boolean[] statoPorte;

    public Auto(String marca, String modello, int anno, int numeroDiPorte) {
        super(marca, modello, anno);
        this.numeroDiPorte = numeroDiPorte;
        statoPorte = new boolean[numeroDiPorte];
        for (int i = 0; i < numeroDiPorte; i++) {
            statoPorte[i] = false;
        }
    }

    public String apriPorta(int porta) {

        if (statoPorte.length < porta) {
            return "porta inesistente";
        }

        if (statoPorte[porta] == false) {
            statoPorte[porta] = true;
            return "porta aperta correttamente";
        } else {
            return "porta già aperta in precedenza";
        }
    }

    public String chiudiPorta(int porta) {

        if (statoPorte.length < porta) {
            return "porta inesistente";
        }

        if (statoPorte[porta] == true) {
            statoPorte[porta] = false;
            return "porta chiusa correttamente";
        } else {
            return "porta già chiusa in precedenza";
        }
    }

    @Override
    public String descrizione() {
        String retValue = "";
        for (int i = 0; i < statoPorte.length; i++) {
            retValue += "Porta n. " + i + ": ";
            if (statoPorte[i] == true) {
                retValue += "aperta\n";
            } else {
                retValue += "chiusa\n";
            }
        }
        return super.descrizione() + "\n " + retValue;
    }

}
