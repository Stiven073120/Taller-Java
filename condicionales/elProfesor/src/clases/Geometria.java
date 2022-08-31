package clases;

public class Geometria {
    private double altura;
    private double base;
    private double base2;

    public double calcularRectangulo() {
        double area = base*altura;
        return area;
    }

    public double calcularTriangulo() {
        double area = base*altura/2;
        return area;
    }

    public double calcularTrapecio() {
        double area = ((base+base2)/2)*altura;
        return area;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setBase2(double base2) {
        this.base2 = base2;
    }
}


