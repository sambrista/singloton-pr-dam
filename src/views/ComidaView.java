package views;

import config.Configuracion;
import models.Comida;

import java.util.Scanner;

public class ComidaView {
    private final Configuracion config;
    private final Scanner scanner;

    public ComidaView() {
        this.config = new Configuracion();
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarComidas(Comida[] comidas) {
        System.out.println("\n📋 Lista de Comidas:");
        if (comidas[0] == null) {
            System.out.println("No hay comidas registradas.");
        } else {
            for (int i = 0; i < comidas.length; i++) {
                if (comidas[i] != null) {
                    System.out.println(comidas[i]);
                }
            }
        }
    }

    public void mostrarTotal(double total) {
        System.out.println("\nTotal de " + config.getUnidadMedida() + ": " + total);
    }

    private void imprimeLogo() {
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("\n");
        for (int i = 0; i < config.getNombreAplicacion().length() + 4; i++) {
            System.out.print("#");
        }
        System.out.print("\n");
        System.out.println("# " + config.getNombreAplicacion() + " #");
        for (int i = 0; i < config.getNombreAplicacion().length() + 4; i++) {
            System.out.print("#");
        }
        System.out.print("\n");

    }

    public int pideOpcion() {
        this.imprimeLogo();
        System.out.println("\n1. Agregar Comida\n2. Ver Comida\n3. Ver Total " + config.getUnidadMedida() + "\n4. Cambiar unidad de medida\n0. Salir");
        System.out.print("Elige una opción: ");
        int opcion = Integer.parseInt(scanner.nextLine());
        return opcion;
    }

    public String pideDescripcion() {
        System.out.print("Descripción de la comida: ");
        return scanner.nextLine();
    }

    public double pideCantidad() {
        System.out.print("Cantidad de " + config.getUnidadMedida() + " de la comida: ");
        return Double.parseDouble(scanner.nextLine());
    }

    public String pideUnidadMedida() {
        System.out.print("Introduzca la unidad de medida: ");
        return scanner.nextLine();
    }

    public void pideContinuar() {
        System.out.println("Presione enter para continuar");
        scanner.nextLine();
    }
}
