public class Main {
    public static void main(String[] args) {

        ConjuntoADT<Integer> conjuntoA = new ConjuntoADT<>();
        ConjuntoADT<Integer> conjuntoB = new ConjuntoADT<>();
        conjuntoA.agregar(1);
        conjuntoA.agregar(2);
        conjuntoA.agregar(3);
        conjuntoA.agregar(3);
        conjuntoA.agregar(4);
        conjuntoA.agregar(6);
        conjuntoB.agregar(3);
        conjuntoB.agregar(4);
        conjuntoB.agregar(7);
        conjuntoB.agregar(6);
        conjuntoB.agregar(1);
        conjuntoB.agregar(8);
        System.out.println("Conjunto A: " + conjuntoA);
        System.out.println("Conjunto B: " + conjuntoB);

        
        System.out.println("Longitud de A: " + conjuntoA.longitud());
        System.out.println("Longitud de B: " + conjuntoB.longitud());

        
        System.out.println("¿Conjunto A contiene 2?: " + conjuntoA.contiene(2));
        System.out.println("¿Conjunto B contiene 2?: " + conjuntoB.contiene(2));

        conjuntoA.agregar(7);
        conjuntoB.agregar(2);
        conjuntoA.eliminar(1);
        conjuntoB.eliminar(1);
        System.out.println("Si agregamos 2 y eliminamos 1 al Conjunto A: " + conjuntoA);
        System.out.println("Si agregamos 7 y eliminamos 1 al Conjunto B: " + conjuntoB);

   
        System.out.println("¿A es igual a B?: " + conjuntoA.equals(conjuntoB));

        System.out.println("¿A es subconjunto de B?: " + conjuntoA.esSubConjunto(conjuntoB));

        
        ConjuntoADT<Integer> conjuntoUnion = conjuntoA.union(conjuntoB);
        System.out.println("Unión de A y B: " + conjuntoUnion);

        
        ConjuntoADT<Integer> conjuntoInterseccion = conjuntoA.interseccion(conjuntoB);
        System.out.println("Intersección de A y B: " + conjuntoInterseccion);

        
        ConjuntoADT<Integer> conjuntoDiferencia = conjuntoA.diferencia(conjuntoB);
        System.out.println("Diferencia de A y B (A-B): " + conjuntoDiferencia);

    }
}