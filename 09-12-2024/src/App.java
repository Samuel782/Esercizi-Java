import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        HashMap<String, Attore> attori = new HashMap<>();

        Attore a = new Attore("Mario", "Rossi", "RSSMRR80A01A123A");

        
        attori.put(a.getCf(), a);

    }
}
