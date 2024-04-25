package Main.Endes.Refactorizacion;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
/**
 * Clase farmacia.
 */
public class Farmacia {
    private Map<String, Integer> inventario;

    /**
     * Constructor de la clase Farmacia.
     */
    public Farmacia() {
        this.inventario = new HashMap<>();
    }

    /**
     * Agrega un medicamento al inventario de la farmacia.
     *
     * @param medicamento el medicamento a agregar.
     * @param cantidad    la cantidad de unidades del medicamento a agregar.
     */
    public void agregarMedicamento(Medicamento medicamento, int cantidad) {
        String nombre = medicamento.getNombre();
        if (inventario.containsKey(nombre)) {
            int cantidadExistente = inventario.get(nombre);
            inventario.put(nombre, cantidadExistente + cantidad);
        } else {
            inventario.put(nombre, cantidad);
        }
    }
    /**
     * Muestra el inventario de la farmacia por consola.
     */
    public void mostrarInventario() {
        System.out.println("Inventario de la farmacia:");
        for (Map.Entry<String, Integer> entry : inventario.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " unidades");
        }
    }
}
