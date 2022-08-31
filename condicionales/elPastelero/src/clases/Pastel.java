package clases;

public class Pastel {
    private String sabor;
    private int cantidadPorciones;
    private String decoraciones;
    private int valor;

    public Pastel( String sabor, int cantidadPorciones, String decoraciones, int valor) {
        this.sabor = sabor;
        this.cantidadPorciones = cantidadPorciones;
        this.decoraciones = decoraciones;
        this.valor = valor;
    }


    public String getSabor() {
        return sabor;
    }

    public String getDecoraciones() {
        return decoraciones;
    }

    public int getCantidadPorciones() {
        return cantidadPorciones;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return sabor+"\t | "+cantidadPorciones+" Porciones | Decoracion: "+decoraciones+" \t| precio $ "+valor;
    }

}
