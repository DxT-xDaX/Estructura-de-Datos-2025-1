package unam.mx.colas;
import java.util.Arrays;

public class ColaConPrioridadAcotada<E> {
    private ColaADT<E> []colas;
    private int maxPrioridad;

    public ColaConPrioridadAcotada(int maxPrioridad) {
        this.maxPrioridad = maxPrioridad;
        this.colas = new ColaADT[maxPrioridad +1];
        for (int i = 0; i < this.maxPrioridad +1; i++) {
            this.colas[i] = new ColaADT<>();
        }
    }

    public int longitud(){
        int total = 0;
        for (int i = 0; i < maxPrioridad+1; i++) {
            total += this.colas[i].longitud();
        }
        return total;
    }

    public boolean estaVacia(){ //
        return this.longitud() == 0;
    }

    public void encolar(int prioridad, E elemento){
        if (prioridad>= 1 && prioridad <= this.maxPrioridad){
            this.colas[prioridad].encolar(elemento);
        }
    }
    
    public E desEncolar(){
        if (this.estaVacia()){
            System.out.println("No hay mas elementos");
            return null;
        }else {
            for (int i = 0; i <= maxPrioridad; i++) {  
                if (!this.colas[i].estaVacia()) {
                    return this.colas[i].desEncolar();  
                }
        }
    }
    return null;
}

@Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    
    for (int i = 0; i <= maxPrioridad; i++) {
        if (!this.colas[i].estaVacia()) {  
            sb.append("Prioridad ").append(i).append(": ").append(this.colas[i].toString()).append("\n");
        }
    }
    if(this.estaVacia())
    {
        System.out.println("La lista esta vacia :)");
    }
    return sb.toString();
}
}
