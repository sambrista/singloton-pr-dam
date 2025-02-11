package controllers;

import models.Comida;
import views.ComidaView;

public class ComidaController {
    private final ComidaView vista;
    private final Comida[] comidas;
    private int contador;
    private final int MAXIMO_COMIDAS = 10;

    public boolean agregarComida(String descripcion, double cantidad) {
        if (contador < MAXIMO_COMIDAS) {
            comidas[contador++] = new Comida(descripcion, cantidad);
            return true;
        }
        return false; // No se puede agregar más de los gastos permitidos
    }

    public Comida[] obtenerComidas() {
        return comidas;
    }

    public double obtenerTotal() {
        double total = 0;
        for (int i = 0; i < contador; i++) {
            total += comidas[i].getCantidad();
        }
        return total;
    }

    public ComidaController() {
        this.comidas = new Comida[MAXIMO_COMIDAS];
        this.contador = 0;
        this.vista = new ComidaView();
    }

    public void iniciar() {
        boolean ejecutando = true;
        while (ejecutando) {
            int opcion = vista.pideOpcion();
            switch (opcion) {
                case 1:
                    String descripcion = vista.pideDescripcion();
                    double cantidad = vista.pideCantidad();
                    if (this.agregarComida(descripcion, cantidad)) {
                        vista.mostrarMensaje("✅ Comida agregada.");
                    } else {
                        vista.mostrarMensaje("❌ No se pueden agregar más de " + MAXIMO_COMIDAS + " comidas.");
                    }
                    break;
                case 2:
                    vista.mostrarComidas(this.obtenerComidas());
                    break;
                case 3:
                    vista.mostrarTotal(this.obtenerTotal());
                    break;
                case 0:
                    ejecutando = false;
                    vista.mostrarMensaje("👋 Saliendo...");
                    break;
                default:
                    vista.mostrarMensaje("⚠ Opción inválida.");
            }
            vista.pideContinuar();
        }
    }
}
