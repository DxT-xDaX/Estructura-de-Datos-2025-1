package listas.unam;
public class DoubleLinkedList<T> {
    private NodoDoble<T> head;
    private NodoDoble<T> tail;
    private int tamanio;

    public DoubleLinkedList() {
    }

    public boolean estaVacia() {
        boolean res = false;
        if (this.head == null && this.tail == null) {
            res = true;
        }
        return res;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void agregarAlInicio(T valor) {
        NodoDoble<T> nuevo = new NodoDoble<>(valor);
        if (this.estaVacia()) {
            this.head = nuevo;
            this.tail = nuevo;
        } else {
            this.head.setAnterior(nuevo);
            nuevo.setSiguiente(this.head);
            this.head = nuevo;
        }
        this.tamanio++;
    }

    public void agregarAlFinal(T valor){
        NodoDoble<T> nuevo = new NodoDoble<>(valor);
        if (this.estaVacia()) {
            this.head = nuevo;
            this.tail = nuevo;
        } else {
            this.tail.setSiguiente(nuevo);
            nuevo.setAnterior(tail);
            this.tail = nuevo;
        }
        this.tamanio++;
    }

    public void agregarDespuesDe(T referencia, T valor) {
        NodoDoble<T> aux = this.head;
        while (aux.getData() != referencia){
            aux = aux.getSiguiente();
        }
        if(aux!= null){
            NodoDoble<T> nuevo = new NodoDoble<>(valor);
            nuevo.setSiguiente(aux.getSiguiente());
            nuevo.setAnterior(aux);
            
            if (aux.getSiguiente() != null) {
                aux.getSiguiente().setAnterior(nuevo);
            } else {
                tail = nuevo;
            }
            aux.setSiguiente(nuevo);
            tamanio++;
        }
        }

    public T obtener(int posicion) {
        if (posicion >= 0 && posicion < tamanio) {
            NodoDoble<T> aux = head;
            for (int i = 0; i < posicion; i++) {
                aux = aux.getSiguiente();
            }
            return aux.getData();
        }
        throw new IndexOutOfBoundsException("Posición inválida");
    } 

    public void eliminarPrimero(){
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.getSiguiente();
                if (head != null) {
                    head.setAnterior(null);
                }
            }
            tamanio--;
    }

    public void eliminarFinal(){
        if (!estaVacia()) {
            if (head == tail) {
                head = tail = null;
            } else {
                tail = tail.getAnterior();
                if (tail != null) {
                    tail.setSiguiente(null);
                }
            }
            tamanio--;
        }
    }

    public void eliminar(int pos){
        if (pos == 0) {
            eliminarPrimero();
        }
        else if (pos == tamanio - 1) {
            eliminarFinal();
        }else{
        NodoDoble<T> aux = this.head;
        for (int i = 0; i < pos; i++){
            aux = aux.getSiguiente();
        }
        aux.getSiguiente().setAnterior(aux.getAnterior());
        aux.getAnterior().setSiguiente(aux.getSiguiente());
        tamanio--;
        }
    }

    public int buscar(T valor) {
        NodoDoble<T> aux = head;  // Asegúrate de que 'cabeza' sea el nombre de tu nodo inicial.
        int pos = 0;
        while (aux != null) {
            if (aux.getData().equals(valor)) {
                System.out.println("El dato esta en la posicion:" +pos);
                return pos;  // Devuelve la posición si se encuentra el valor.
            }
            aux = aux.getSiguiente();  // Avanza al siguiente nodo.
            pos++;
        }
        return -1;  // Devuelve -1 si no se encuentra el valor.
    }
    

    public void actualizar(int aBuscar, T valor) {
        if (aBuscar >= 0 && aBuscar < tamanio) {
            NodoDoble<T> aux;
                if (aBuscar < tamanio / 2) {
                       
                 aux = head;
                for (int i = 0; i < aBuscar; i++) {
                aux = aux.getSiguiente();
                }
                } else {
                        
                    aux = tail;
                    for (int i = tamanio - 1; i > aBuscar; i--) {
                     aux = aux.getAnterior();
                    }
                    }
                    aux.setData(valor);  
                } else {
                throw new IndexOutOfBoundsException("Posición inválida");
                }
       
        }
        

    public void transversal(String direccion) {
        if (direccion.equalsIgnoreCase("derecha")) {
            NodoDoble<T> aux = head;
            while (aux != null) {
                System.out.print(aux);
                aux = aux.getSiguiente();
            }
        } else if (direccion.equalsIgnoreCase("izquierda")) {
            NodoDoble<T> aux = tail;
            while (aux != null) {
                System.out.print(aux);
                aux = aux.getAnterior();
            }
        }
        System.out.println("");
    }
}
