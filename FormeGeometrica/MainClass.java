import java.util.Scanner;

import FormeGeometriche.*;

public class MainClass {
    public static void main(String[] args) {

        System.out.println("-----Forme geometriche-----");
        System.out.println("Digita 1 per cerchio\n Digita 2 per Quadrato\n Digita 3 per triangolo: ");

        Scanner tastiera = new Scanner(System.in);

        int scelta = tastiera.nextInt();

        switch (scelta) {
            case 1:
                testCerchio();
                break;
            case 2:
                testQuadrato();
                break;
            case 3: 
                testTriangolo();
                break;
            default:
                System.err.println("ERRORE, VALORE INSERITO NON DEFINITO");
                break;
        }

        tastiera.close();

    }

    public static void testCerchio() {

        Cerchio c = new Cerchio(5);

        System.out.println("Raggio: " + c.getRaggio() +
                "\nDiametro: " + c.getDiametro() +
                "\nPermetro: " + c.getPerimetro() +
                "\nArea: " + c.getArea());

        System.err.println("----------");
        c.setDiametro(26);

        System.out.println("Raggio: " + c.getRaggio() +
                "\nDiametro: " + c.getDiametro() +
                "\nPermetro: " + c.getPerimetro() +
                "\nArea: " + c.getArea());

        System.err.println("----------");
        c.setPerimetro(256);

        System.out.println("Raggio: " + c.getRaggio() +
                "\nDiametro: " + c.getDiametro() +
                "\nPermetro: " + c.getPerimetro() +
                "\nArea: " + c.getArea());

        System.err.println("----------");
        c.setArea(1432);

        System.out.println("Raggio: " + c.getRaggio() +
                "\nDiametro: " + c.getDiametro() +
                "\nPermetro: " + c.getPerimetro() +
                "\nArea: " + c.getArea());

    }

    public static void testTriangolo() {
        Triangolo t = new Triangolo(10, 5);

        System.out.println("Base: " + t.getBase() +
                "\nAltezza: " + t.getAltezza() +
                "\nArea: " + t.getArea() +
                "\nPerimetro: " + t.getPerimetro());

        System.err.println("----------");
        t.setBase(15);

        System.out.println("Base: " + t.getBase() +
                "\nAltezza: " + t.getAltezza() +
                "\nArea: " + t.getArea() +
                "\nPerimetro: " + t.getPerimetro());

        System.err.println("----------");
        t.setAltezza(12);

        System.out.println("Base: " + t.getBase() +
                "\nAltezza: " + t.getAltezza() +
                "\nArea: " + t.getArea() +
                "\nPerimetro: " + t.getPerimetro());
    }

    public static void testQuadrato() {
        Quadrato q = new Quadrato(4);

        System.out.println("Lato: " + q.getLato() +
                "\nPerimetro: " + q.getPerimetro() +
                "\nArea: " + q.getArea());

        System.err.println("----------");
        q.setLato(6);

        System.out.println("Lato: " + q.getLato() +
                "\nPerimetro: " + q.getPerimetro() +
                "\nArea: " + q.getArea());

        System.err.println("----------");
        q.setPerimetro(40);

        System.out.println("Lato: " + q.getLato() +
                "\nPerimetro: " + q.getPerimetro() +
                "\nArea: " + q.getArea());

        System.err.println("----------");
        q.setArea(64);

        System.out.println("Lato: " + q.getLato() +
                "\nPerimetro: " + q.getPerimetro() +
                "\nArea: " + q.getArea());
    }

}
