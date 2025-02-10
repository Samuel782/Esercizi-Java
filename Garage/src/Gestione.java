import java.util.HashMap;

public class Gestione {
    private HashMap<String, Veicolo> veicoli;

    public Gestione() {
        veicoli = new HashMap<>();
    }

    public boolean addVeicolo(String telaio, String marca, String modello) {
        if (veicoli.containsKey(telaio))
            return false;

        veicoli.put(telaio, new Veicolo(telaio, marca, modello));
        return true;
    }

    public boolean assegnaProprietario(String telaio, String cf, String nome, String cognome) {
        if (veicoli.containsKey(telaio) && veicoli.get(telaio).addProprietario(new Proprietario(nome, cognome, cf)))
            return true;
            
        return false;
    }

}
