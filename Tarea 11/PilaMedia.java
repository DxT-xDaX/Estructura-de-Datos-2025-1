package unam.mx.recursividad;
import java.util.Stack;

public class PilaMedia {
    public static int sacarMedia(Stack<Integer> pila) {
        int tamaño = pila.size();
        if (tamaño == 0) {
            System.out.println("La pila está vacía.");
        }
        return sacarMediaRecursivo(pila, tamaño, 0);
    }

    private static int sacarMediaRecursivo(Stack<Integer> pila, int tamaño, int contador) {
        if (contador == tamaño / 2) {
            return pila.pop();  
        }
        int valor = pila.pop();
        int valorMedio = sacarMediaRecursivo(pila, tamaño, contador + 1);
        pila.push(valor);

        return valorMedio;
    }

    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);

        System.out.println("Elemento en la posición media: " + sacarMedia(pila));
        
        System.out.println("Pila después de sacar el medio: " + pila);
    }
}
