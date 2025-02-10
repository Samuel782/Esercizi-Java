import java.util.HashMap;

public class Veicolo {
    private String telaio;
    private String marca;
    private String modello;

    private HashMap<String, Proprietario> proprietari;

    public Veicolo(String telaio, String marca, String modello) {
        this.telaio = telaio;
        this.marca = marca;
        this.modello = modello;
        
        proprietari = new HashMap<>();
    }

    public boolean addProprietario(Proprietario p){
        if(proprietari.containsKey(p.getCf())) return false;
        proprietari.put(p.getCf(), p);
        return false;
    }
    
    
    
}