package models;

import config.Configuracion;

public class Comida {
    private final Configuracion config;
    private String descripcion;
    private double cantidad;

    public Comida(String descripcion, double cantidad) {
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.config = new Configuracion();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return descripcion + ": " + cantidad + " " + config.getUnidadMedida();
    }
}
