import java.util.HashMap;

public class Film {

    private String nome;
    private HashMap<String, Attore> attori;

    public Film(String nome) {
        this.nome = nome;
        this.attori = new HashMap<>();
    }

    boolean addAttore(Attore attore) {
        if(attori.containsKey(attore.getCf())) {
            return false;
        }else {
            attori.put(attore.getCf(), attore);
            return true;
        }
    }
    
}
