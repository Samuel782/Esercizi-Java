public class Veicolo {

    /*
     * Classe base Veicolo
     * Attributi:
     * marca
     * modello
     * anno
     * Metodo:
     * descrizione() che stampa le informazioni del veicolo
     */

    private String marca;
    private String modello;
    private int anno;

    public Veicolo(String marca, String modello, int anno) {
        this.marca = marca;
        this.modello = modello;
        this.anno = anno;
    }

    public String descrizione() {
        return this.marca + " " + this.modello + " " + this.anno;
    }

}