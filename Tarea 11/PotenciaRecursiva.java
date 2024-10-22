package unam.mx.recursividad;
public class PotenciaRecursiva {

    public static int potencia(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return a * potencia(a, b - 1);
    }

    public static void main(String[] args) {
        int numero = 2;
        int exponente = 6;
        int resultado = potencia(numero, exponente);
        System.out.println("El resultado de la potencia es: " + numero + "^" + exponente + " = " + resultado);
    }
}
