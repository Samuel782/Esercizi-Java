public class Gestione {
    public static void main(String[] args) throws Exception {
        Auto a = new Auto("Subaro", "Baracca", 1999, 5);

        System.out.println(a.descrizione());
        System.out.println(a.apriPorta(1));
        System.out.println(a.apriPorta(8));
        System.out.println(a.apriPorta(0));
        System.out.println(a.apriPorta(1));
        System.out.println(a.apriPorta(2));
        System.out.println(a.chiudiPorta(1));
        System.out.println(a.descrizione());

        System.out.println("------");
        Moto m = new Moto("piaggio", "Vespa", 1969, "Scooter");

        System.out.println(m.descrizione());
        System.out.println(m.mettiCavaletto());
        System.out.println(m.mettiCavaletto());
        System.out.println(m.togliCavaletto());
        System.out.println(m.togliCavaletto());
        System.out.println(m.mettiCavaletto());
        System.out.println(m.descrizione());

    }
}
