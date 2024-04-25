package Main.Endes.MisArrays;


public class MisArrays {
    static int[] array1, array2, resul;

    public MisArrays() {
        super();
    }

    public int[] sumar(int[] a1, int[] a2) {
        if (a1.length != a2.length)
            return null;
        int[] salida = new int[a1.length];
        for (int i = 0; i < a1.length; i++) {
            salida[i] = a1[i] + a2[i];
        }
        return salida;
    }

    public void decrementar(int[] arra, int num) {
        for (int i = 0; i < arra.length; i++) {
            arra[i] = arra[i] - num;
        }
    }



}

