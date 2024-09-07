package listas.unam;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList<Integer> numeros= new DoubleLinkedList<>();

        numeros.agregarAlInicio(90);
        numeros.agregarAlInicio(80);
        numeros.agregarAlInicio(70);
        numeros.agregarAlInicio(65);
        numeros.agregarAlInicio(60);
        numeros.agregarAlInicio(50);
        numeros.transversal("derecha");

        numeros.eliminar(2);
        numeros.transversal("derecha");

        numeros.actualizar(4, 88);
        numeros.transversal("derecha");

        numeros.buscar(80);

    }
}
