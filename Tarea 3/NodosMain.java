public class NodosMain {
    public static void main(String[] args) {
        
        Nodo<Integer> head = new Nodo<>(100,new Nodo<>(200,new Nodo<>(300, new Nodo<>(400, new Nodo<>(600)))));
        
        Nodo<Integer> aux = head;
        System.out.print("|");
        while (aux != null){
            System.out.print(aux.getDato() + "| -> |");
            aux = aux.getSiguiente();
        }
        System.out.println("null|");

        head.getSiguiente().getSiguiente().setDato(333);
        Nodo<Integer> aux2 = head;
        System.out.print("|");
        while (aux2 != null){
            System.out.print(aux2.getDato() + "| -> |");
            aux2 = aux2.getSiguiente();
        }
        System.out.println("null|");

        head.getSiguiente().getSiguiente().getSiguiente().getSiguiente().setSiguiente(new Nodo<>(700));
        
        Nodo<Integer> aux3 = head;
        System.out.print("|");
        while (aux3 != null){
            System.out.print(aux3.getDato() + "| -> |");
            aux3 = aux3.getSiguiente();
        }
        System.out.println("null|");

       head = new Nodo<>(50,head);
        Nodo<Integer> aux4 = head;
        System.out.print("|");
        while (aux4 != null){
            System.out.print(aux4.getDato() + "| -> |");
            aux4 = aux4.getSiguiente();
        }
        System.out.println("null|");
    





    }
}
