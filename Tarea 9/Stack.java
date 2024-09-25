package unam.mx.pilas;
import java.util.Arrays;

public class Stack {
    private int top;  
    private int[] stackArray;  
    private int maxSize;  

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;  
    }

    public boolean isEmpty() {
        boolean r = false;
        if(maxSize == 0){
        r = true;
        }
        return r;
    }

    public int length() {
        return top + 1;
    }

    public int pop() {
        if (!isEmpty()) {
            return stackArray[top--];
        } else {
            System.out.println("La pila esta vacia");
            return -1; 
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return stackArray[top];
        } else {
            System.out.println("La pila esta vacia");
            return -1; 
        }
    }

    public void push(int value) {
        if (!isFull()) {
            stackArray[++top] = value;
        } else {
            System.out.println("La pila esta llena");
        }
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "La pila esta vacia.";
        }
        return "Estado de la pila: " + Arrays.toString(Arrays.copyOfRange(stackArray, 0, top + 1));
    }
}
