import java.util.HashMap;

public class Album {
    private HashMap<String, Artista> artisti;
    private HashMap<String, Brano> brani;

    public boolean addArtista(Artista a) {
        String cfa = a.getCf();

        if (artisti.containsKey(cfa))
            return false;

        artisti.put(cfa, a);
        
        return true;
    }
}
