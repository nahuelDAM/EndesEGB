package Main.Endes.Refactorizacion;
/**
 * Clase que representa un medicamento especializado hereda de medicamento.
 */

public class MedicamentoEspecializado extends Medicamento {
    private String tipo;

    /**
     * Constructor de la clase MedicamentoEspecializado.
     *
     * @param nombre el nombre del medicamento.
     * @param precio el precio del medicamento.
     * @param tipo   el tipo de especialización del medicamento.
     */
    public MedicamentoEspecializado(String nombre, double precio, String tipo) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    /**
     * Obtiene el tipo de especialización del medicamento.
     *
     * @return el tipo de especialización del medicamento.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Establece el tipo de especialización del medicamento.
     *
     * @param tipo el tipo de especialización del medicamento.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + ", Precio: " + getPrecio() + ", Tipo: " + tipo;
    }
}