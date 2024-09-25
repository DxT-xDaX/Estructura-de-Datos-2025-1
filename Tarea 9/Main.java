package unam.mx.pilas;
public class Main{
public static void main(String[] args) {
    Llaves llaves = new Llaves();

    String test1 = "{(a + b) * (c + d)}";  
    String test2 = "{(a + b) * c + d)}";  
    String test3 = "{{(())}}"; 
    String test4 = "{{(()}}"; 
    String test5 = "package unam.mx.pilas; public class main{public static void main(String[] args){LLaves llaves = new Llaves();}}";   
    String test6 = "package unam.mx.pilas; public class main{public static void main(String[] args){LLaves llaves = new Llaves();}";           

    // condicion ? valor_si_true : valor_si_false;
    // true = Balanceado // false = No Balanceado
    System.out.println("Prueba 1: " + (llaves.checarBalanceo(test1) ? "Balanceado" : "No balanceado"));
    System.out.println("Prueba 2: " + (llaves.checarBalanceo(test2) ? "Balanceado" : "No balanceado"));
    System.out.println("Prueba 3: " + (llaves.checarBalanceo(test3) ? "Balanceado" : "No balanceado"));
    System.out.println("Prueba 4: " + (llaves.checarBalanceo(test4) ? "Balanceado" : "No balanceado"));
    System.out.println("Prueba 5: " + (llaves.checarBalanceo(test5) ? "Balanceado" : "No balanceado"));
    System.out.println("Prueba 6: " + (llaves.checarBalanceo(test6) ? "Balanceado" : "No balanceado"));
    }
}
