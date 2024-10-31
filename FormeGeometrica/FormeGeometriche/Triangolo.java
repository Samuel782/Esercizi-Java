package FormeGeometriche;

public class Triangolo {
    
    private double base;
    private double altezza;
    private double ipotenusa;
    private double area;
    private double perimetro;

    public Triangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
        this.area = (base * altezza) / 2;
        this.ipotenusa = Math.sqrt(base * base + altezza * altezza); 
        this.perimetro = base + altezza + this.ipotenusa;
    }

    public void setBase(double base) {
        this.base = base;
        this.area = (base * this.altezza) / 2;
        this.ipotenusa = Math.sqrt(base * base + this.altezza * altezza);
        this.perimetro = base + this.altezza + this.ipotenusa;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
        this.area = (this.base * altezza) / 2;
        this.ipotenusa = Math.sqrt(this.base * this.base + altezza * altezza);
        this.perimetro = this.base + altezza + this.ipotenusa;
    }

    public void setArea(double area) {
        this.area = area;
        this.altezza = (2 * area) / this.base; 
        this.ipotenusa = Math.sqrt(this.base * this.base + this.altezza * altezza);
        this.perimetro = this.base + this.altezza + this.ipotenusa;
    }

    // Metodi per ottenere gli attributi
    public double getBase() {
        return this.base;
    }

    public double getAltezza() {
        return this.altezza;
    }

    public double getIpotenusa() {
        return this.ipotenusa;
    }

    public double getArea() {
        return this.area;
    }

    public double getPerimetro() {
        return this.perimetro;
    }

}
