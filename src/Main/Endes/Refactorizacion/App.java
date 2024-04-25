package Main.Endes.Refactorizacion;

import java.util.Random;

public class App {
    /**
     * Método principal que inicializa el programa.
     *
     * @param args los argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        Farmacia farmacia = new Farmacia();
        Random random = new Random();

        for (int i = 1; i <= 10; i++) {
            String nombre = "Medicamento" + i;
            double precio = random.nextDouble() * 100;
            MedicamentoGenerico medicamentoGenerico = new MedicamentoGenerico(nombre, precio);
            farmacia.agregarMedicamento(medicamentoGenerico, 100);

            String tipo = "Tipo" + i;
            MedicamentoEspecializado medicamentoEspecializado = new MedicamentoEspecializado(nombre, precio, tipo);
            farmacia.agregarMedicamento(medicamentoEspecializado, 20);
        }

        farmacia.mostrarInventario();
    }
}

