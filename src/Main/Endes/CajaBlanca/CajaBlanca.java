package Main.Endes.CajaBlanca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CajaBlanca {
    public static int ejercicio2(int a, int b, int c) {
        int x = 0;
        if (a > 1 && (b > 5) && (c < 2)) {
            x = x + 1;
        } else
            x = x - 1;
        return x;
    }
    public static void ejercicio3() throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        int x, y, z, max;

        System.out.println("Introduce x,y,z: ");
        x = Integer.parseInt(entrada.readLine());
        y = Integer.parseInt(entrada.readLine());
        z = Integer.parseInt(entrada.readLine());

        if (x > y && x > z)
            max = x;
        else if (z > y)
            max = z;
        else
            max = y;
        System.out.println("El máximo es " + max);
    }

    public static int ejercicio4(char[] cadena, char letra)
    {
        int contador, n,  lon;
        n=0; contador=0;
        lon = cadena.length;
        if (lon > 0) {
            do {
                if (cadena[contador] == letra)
                    n++;
                contador++;
                lon--;
            } while (lon > 0);
        }
        return n;}
}

