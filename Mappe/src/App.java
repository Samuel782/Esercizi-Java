import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws Exception {
        HashMap<String, Persona> persone = new HashMap<>();
        TreeMap<String, Persona> persone1 = new TreeMap<>();
        LinkedHashMap<String, Persona> persone2 = new LinkedHashMap<>();

        Persona p = new Persona("LGGSML07H21B108F", "Samuel", "Luggeri");
        persone.put(p.getCf(), p);

        Persona p2 = new Persona("STRGVN68H13G155H", "Giovanni", "Storti");
        persone.put(p2.getCf(), p2);

        System.out.println(persone.get("LGGSML07H21B108F"));
        System.out.println(persone.get("STRGVN68H13G155H"));

        if (persone.containsKey("LGGSML07H21B108F")) {
            // Torna vero se la mappa contine un elemento con quella chiave
            System.out.println("True");
        }

        System.out.println("----");
        for (String k : persone.keySet()) { // Itero sulle chiavi
            System.out.println(persone.get(k));
        }
        System.out.println("----");
        for (Persona px : persone.values()) { // Itero sui valori
            System.out.println(px);
        }

        for(Map.Entry<String, Persona> coppia : persone.entrySet()){
            
        }
    }
}
