import java.util.HashMap;

public class App {

    private HashMap<String, Artista> artisti;
    private HashMap<String, Album> albums;
    private HashMap<String, Brano> brani;

    public App() {
        artisti = new HashMap<String, Artista>();

    }

    public boolean addArtista(String cf, String nome, String cognome) {
        if (artisti.containsKey(cf))
            return false;

        artisti.put(cf, new Artista(cf, nome, cognome));
        return true;
    }

    public boolean incidiAlbum(String codAlbum, String cf, String codBrano) {

        if (!albums.containsKey(codAlbum) || !artisti.containsKey(cf) || !brani.containsKey(codBrano))
            return false;

        albums.get(codAlbum).addArtista(artisti.get(cf));

        return true;
    }

    public String getArtisti(){
        String retString="";

        for (Artista a : artisti.values()) {
            retString += a + "\n";
        }

        return retString;
    }

}
