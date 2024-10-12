package unam.mx.nodo.arbol;
public class Main {
    public static void main(String[] args) {
        System.out.println("Practicar con árboles");
        NodoArbol<String> numeros = new NodoArbol<>("Raiz");
        numeros.setHijoIzquierdo(new NodoArbol<>("10"));
        numeros.getHijoIzquierdo().setHijoIzquierdo(new NodoArbol<>("5"));
        numeros.getHijoIzquierdo().getHijoIzquierdo().setHijoIzquierdo(new NodoArbol<>("1"));
        numeros.getHijoIzquierdo().setHijoDerecho(new NodoArbol<>("15"));
        numeros.getHijoIzquierdo().getHijoDerecho().setHijoDerecho(new NodoArbol<>("25"));
        System.out.println(numeros);
        System.out.println(".-.-.-.-.-.-");

        NodoArbol<String> nombres = new NodoArbol<>("Raiz",null,new NodoArbol<>("Diego",new NodoArbol<>("Pedro",new NodoArbol<>("Susan"), new NodoArbol<>("Diana")),new NodoArbol<>("Mario")));
        System.out.println(nombres);
        System.out.println(".-.-.-.-.-.-");
    }
}
