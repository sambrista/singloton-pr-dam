package config;

public class Configuracion {
    private static Configuracion instancia;

    private String unidadMedida;
    private String nombreAplicacion;
    private int numeroMaximoComidas;

    // Constructor privado
    private Configuracion() {
        this.unidadMedida = "Calorias";  //
        this.nombreAplicacion = "Gestor de Nutrición SinGlotón";
        this.numeroMaximoComidas = 5; // Máximo de 5 gastos registrados
    }

    // Método para obtener la instancia del Singleton
    public static Configuracion getInstancia() {
        if (instancia == null) {
            instancia = new Configuracion();
        }
        return instancia;
    }

    // Getters y setters
    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public String getNombreAplicacion() {
        return nombreAplicacion;
    }

    public void setNombreAplicacion(String nombreAplicacion) {
        this.nombreAplicacion = nombreAplicacion;
    }

    public int getNumeroMaximoComidas() {
        return numeroMaximoComidas;
    }

    public void setNumeroMaximoComidas(int numeroMaximoComidas) {
        this.numeroMaximoComidas = numeroMaximoComidas;
    }
}
