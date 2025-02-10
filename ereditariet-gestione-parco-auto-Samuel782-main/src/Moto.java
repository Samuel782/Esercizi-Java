public class Moto extends Veicolo {

    /*
     * Attributi aggiuntivi:
     * tipo
     * stato_cavalletto
     *
     * Metodi:
     * descrizione() che sovrascrive il metodo della classe base per includere il
     * tipo di moto
     * 
     * metti_cavalletto() che gestisce l'inserimento del cavalletto. Visualizzare
     * opportuni messaggi:
     * "cavalletto inserito correttamente"
     * "cavalletto già inserito in precedenza"
     * 
     * togli_cavalletto() che gestisce la rimozione del cavalletto. Visualizzare
     * opportuni messaggi:
     * "cavalletto rimosso correttamente"
     * "cavalletto già rimosso in precedenza"
     */

    private String tipo;
    private boolean statoCavalleto;

    public Moto(String marca, String modello, int anno, String tipo) {
        super(marca, modello, anno);
        this.tipo = tipo;
        this.statoCavalleto = false;
    }

    public String mettiCavaletto() {
        if (this.statoCavalleto == true) {
            return "cavalletto già inserito in precedenza";
        } else {
            this.statoCavalleto = true;
            return "cavalletto inserito correttamente";
        }
    }

    public String togliCavaletto() {
        if (this.statoCavalleto == false) {
            return "cavalletto rimosso correttamente";
        } else {
            this.statoCavalleto = false;
            return "cavalletto già rimosso in precedenza";
        }
    }

    @Override
    public String descrizione() {
        return super.descrizione() + " " + this.tipo;
    }

}
