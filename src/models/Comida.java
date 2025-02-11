package models;

public class Comida {
    private String descripcion;
    private double cantidad;

    public Comida(String descripcion, double cantidad) {
        this.descripcion = descripcion;
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return descripcion + ": " + cantidad + " calorías.";
    }
}
