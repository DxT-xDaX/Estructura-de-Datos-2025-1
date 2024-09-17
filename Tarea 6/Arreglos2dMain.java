package unam.mx;
import java.util.Random;
import java.util.Scanner;

public class Arreglos2dMain {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int filas = 6; 
        int columnas = 6;
        Array2d rejilla = new Array2d(filas, columnas);

        inicializarAleatoriamente(rejilla);

        System.out.println("Estado inicial:");
        System.out.println(rejilla);

        System.out.print("Introduce el número de generaciones a simular: ");
        int generaciones = teclado.nextInt();

        for (int i = 0; i < generaciones; i++) {
            siguienteGeneracion(rejilla);
            System.out.println("Generación " + ( + 1) + ":");
            System.out.println(rejilla);
        }
    }

    //'V' = viva 'M' = muerta
    public static void inicializarAleatoriamente(Array2d rejilla) {
        Random random = new Random();
        for (int i = 0; i < rejilla.getRowSize(); i++) {
            for (int j = 0; j < rejilla.getColSize(); j++) {
                if (random.nextBoolean()) {
                    rejilla.setItem(i, j, 'V');  
                } else {
                    rejilla.setItem(i, j, 'M');  
                }
            }
        }
    }

    public static void siguienteGeneracion(Array2d rejilla) {
        Array2d nuevaRejilla = new Array2d(rejilla.getRowSize(), rejilla.getColSize());

        for (int i = 0; i < rejilla.getRowSize(); i++) {
            for (int j = 0; j < rejilla.getColSize(); j++) {
                int vecinosVivos = contarVecinosVivos(rejilla, i, j);
                char estadoActual = rejilla.getItem(i, j);

                
                if (estadoActual == 'V') {  
                    if (vecinosVivos < 2 || vecinosVivos > 3) {
                        nuevaRejilla.setItem(i, j, 'M');  
                    } else {
                        nuevaRejilla.setItem(i, j, 'V');  
                    }
                } else { 
                    if (vecinosVivos == 3) {
                        nuevaRejilla.setItem(i, j, 'V');  
                    } else {
                        nuevaRejilla.setItem(i, j, 'M');  
                    }
                }
            }
        }

        for (int i = 0; i < rejilla.getRowSize(); i++) {
            for (int j = 0; j < rejilla.getColSize(); j++) {
                rejilla.setItem(i, j, nuevaRejilla.getItem(i, j));
            }
        }
    }

    public static int contarVecinosVivos(Array2d rejilla, int fila, int columna) {
        int[] dFila = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dColumna = {-1, 0, 1, -1, 1, -1, 0, 1};
        int vecinosVivos = 0;

        for (int i = 0; i < dFila.length; i++) {
            int nuevaFila = fila + dFila[i];
            int nuevaColumna = columna + dColumna[i];

            if (nuevaFila >= 0 && nuevaFila < rejilla.getRowSize() && nuevaColumna >= 0 && nuevaColumna < rejilla.getColSize()) {
                if (rejilla.getItem(nuevaFila, nuevaColumna) == 'V') {
                    vecinosVivos++;
                }
            }
        }

        return vecinosVivos;
    }
}
