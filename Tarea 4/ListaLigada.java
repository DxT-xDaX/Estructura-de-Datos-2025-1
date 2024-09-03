
public class ListaLigada<T> {
    private Nodo<T> head;
    private int tamanio;

    public ListaLigada() {
    }
    public boolean estaVacia(){
        boolean conj=false;
        if (this.head == null) {
            System.out.println("esta vacia");
            conj=true;
            
        }
        return conj;
    }

    public int getTamanio(){
        Nodo aux = this.head;
        int contador = 0;
        while (aux!=null){
            contador++;
            aux = aux.getSiguiente();
        }
         return contador;
    }

    public void agregarAlFinal(T dato){
        Nodo<T> nuevo = new Nodo<>(dato);
        if(head == null){
            head = nuevo;
        }else {
            Nodo<T> aux = this.head;
            while (aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }

    public void agregarAlInicio(T dato){
        this.head = new Nodo<>(dato, this.head);

    }

    public void agregarDespuesDe(int ref,T dato){
        Nodo<T> aux = head;
        while (aux != null && !aux.getDato().equals(ref)) {
            aux = aux.getSiguiente();
        }
        if (aux != null) {
            Nodo<T> nuevo = new Nodo<>(dato);
            nuevo.setSiguiente(aux.getSiguiente());  
            aux.setSiguiente(nuevo);  
            tamanio++;
        }

    }

    public void eliminar(int pos){
        if (pos == 0) {
            eliminarElPrimero();
        } else {
            Nodo<T> aux = head;
            for (int i = 0; i < pos - 1; i++) {
                aux = aux.getSiguiente();  
            }
            aux.setSiguiente(aux.getSiguiente().getSiguiente());  
            tamanio--;
        }
    }

    public void eliminarElPrimero(){
        if (!estaVacia()) {
            head = head.getSiguiente();
            tamanio--;
        }
    }

    public void eliminarElFinal(){
        if (!estaVacia()) {
            if (tamanio == 1) {
                head = null;
            } else {
                Nodo<T> aux = head;
                while (aux.getSiguiente().getSiguiente() != null) {  
                    aux = aux.getSiguiente();  
                }
                aux.setSiguiente(null);  
            }
            tamanio--;
        }
    }

    public int buscar(T dato){
        Nodo<T> aux = head;
        int posicion = 0;
        while (aux != null) {
            if (aux.getDato().equals(dato)) {
                return posicion;
            }
            aux = aux.getSiguiente();  
            posicion++;
        }
        return -1;  
    }

    public void actualizar(int pos,T dato) {
        if (pos < 0 || pos>= getTamanio()) {
            System.out.println("Posición fuera de rango");
            return;
        }
    
        Nodo<T> aux = head;
        for (int i = 0; i < pos; i++) {
            aux = aux.getSiguiente();
        }
    
        aux.setDato(dato);
}
    
    public void transversal(){
        Nodo<T> aux = this.head;
        while (aux != null){
            System.out.print(aux.getDato() + " --> ");
            aux = aux.getSiguiente();
        }
        System.out.println("null");
    }
}
