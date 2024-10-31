package FormeGeometriche;

public class Cerchio {

    // Attributi
    private double raggio;
    private double diametro;
    private double perimetro;
    private double area;

    public final double PI = 3.14159;

    
    public Cerchio(double raggio) {
        this.raggio = raggio;
        this.diametro = raggio * 2;
        this.perimetro = 2 * PI * raggio;
        this.area = PI * raggio * raggio;
    }

    // Metodi per impostare gli attributi
    public void setRaggio(double r) {
        this.raggio = r;
        this.diametro = r * 2;
        this.perimetro = 2 * PI * r;
        this.area = PI * r * r;
    }

    public void setDiametro(double d) {
        this.raggio = d / 2;
        this.diametro = d;
        this.perimetro = PI * d;
        this.area = PI * this.raggio;
    }

    public void setPerimetro(double p) {
        this.raggio = p / (2 * PI);
        this.diametro = this.raggio * 2;
        this.perimetro = p;
        this.area = PI * this.raggio * this.raggio;
    }

    public void setArea(double a) {
        this.raggio = Math.sqrt(a / PI);
        this.diametro = this.raggio * 2;
        this.perimetro = 2 * PI * this.raggio;
        this.area = a;
    }

    // Metodi per ottenere gli attributi
    public double getRaggio() {
        return this.raggio;
    }

    public double getDiametro() {
        return this.diametro;
    }

    public double getPerimetro() {
        return this.perimetro;
    }

    public double getArea() {
        return this.area;
    }

}