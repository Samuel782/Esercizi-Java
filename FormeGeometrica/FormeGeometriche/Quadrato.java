package FormeGeometriche;

public class Quadrato {

    private double lato;
    private double area;
    private double perimetro;

    public Quadrato(double l) {
        this.lato = l;
        this.perimetro = 4 * l;
        this.area = l * l;
    }

    // Metodi per impostare gli attributi
    public void setLato(double l) {
        this.lato = l;
        this.perimetro = 4 * l;
        this.area = l * l;
    }

    public void setPerimetro(double p) {
        this.lato = p / 4;
        this.perimetro = p;
        this.area = this.lato * this.lato;
    }

    public void setArea(double a) {
        this.lato = Math.sqrt(a);
        this.perimetro = 4 * this.lato;
        this.area = this.lato * this.lato;
    }

    // Metodi per ottenere gli attributi
    public double getLato() {
        return this.lato;
    }

    public double getPerimetro() {
        return this.perimetro;
    }

    public double getArea() {
        return this.area;
    }

}
