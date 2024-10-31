import Moda.*;

public class MainClass {
    public static void main(String[] args) {

        Collezione collezionePino = new Collezione("Collezione Pino");

        // Dichiarazione possibili colori per capo;
        Colore rosso = new Colore("rosso");
        Colore nero = new Colore("nero");
        Colore viola = new Colore("viola");
        Colore blu = new Colore("blu");
        Colore giallo = new Colore("giallo");

        // Dichiarazione possibili materiali
        Materiale cotone = new Materiale("cotone", 15);
        Materiale lino = new Materiale("Lino", 20);
        Materiale lanaMerino = new Materiale("Lana Merino", 50);
        Materiale seta = new Materiale("seta", 70);
        Materiale elastan = new Materiale("Elastan", 8);

        // Dichiarazione possibili modelli
        Modello tshirt = new Modello("T-shirt", 3.5, 1.5);
        Modello camicia = new Modello("Camicia", 6, 2);
        Modello vestito = new Modello("Vestito", 13, 2.5);

        // Dichiarazione dei possibili capi
        Capo tshirtCapo = new Capo(tshirt, elastan, giallo);
        Capo camiciaCapo = new Capo(camicia, lino, nero);
        Capo vestitoCapo = new Capo(vestito, seta, viola);

        boolean ok;
        ok = collezionePino.add(tshirtCapo);
        if (!ok)
            System.err.println("ERORE");

        ok = collezionePino.add(camiciaCapo);
        if (!ok)
            System.err.println("ERORE");

        ok = collezionePino.add(vestitoCapo);
        if (!ok)
            System.err.println("ERORE");

        System.out.println("-----Per Colore-----");
        System.out.println(collezionePino.getCapiPerColore(giallo));
        System.out.println(collezionePino.getCapiPerColore(viola));
        System.out.println("-----Per Modello----");
        System.out.println(collezionePino.getCapiPerModello(vestito));
        System.out.println(collezionePino.getCapiPerModello(camicia));
        System.out.println(collezionePino.getCapiPerModello(tshirt));
        System.out.println("-----Per Materiale----");
        System.out.println(collezionePino.getCapiPerMateriale(elastan));
        System.out.println(collezionePino.getCapiPerMateriale(lino));
        System.out.println(collezionePino.getCapiPerMateriale(lanaMerino));
        System.out.println("-----Per Costo----");
        System.out.println(collezionePino.getCapiPerPrezzo(0, 300));

    }

}
