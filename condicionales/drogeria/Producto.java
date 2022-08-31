package drogeria;

public class Producto {
    
    String nombre;
    String descripcion;
    int valor;
    int cantidad;
    
    public void comprarProducto(int cantidadCompra) {
        cantidad -= cantidadCompra;
    }

    public void devolverProducto(int cantidadDevolucion) {
        cantidad += cantidadDevolucion;
    }
}
