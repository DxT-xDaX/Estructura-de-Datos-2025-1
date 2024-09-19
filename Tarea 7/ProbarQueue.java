package unam.mx.colas;

public class ProbarQueue {
    public static void main(String[] args) {
        ColaADT<Paciente> paciente = new ColaADT<>();
        paciente.encolar(new Paciente("Alejandro", "Perez",18));
        paciente.encolar(new Paciente("Pepe", "Hernandez",27));
        paciente.encolar(new Paciente("Juan","Rodriguez",50));
        System.out.println(paciente);
        System.out.println("El siguiente es: "+paciente.frente());
        System.out.println("Atendiendo a : " + paciente.desEncolar());
        System.out.println(paciente);
        paciente.encolar(new Paciente("Socorro","De la luz",40));
        paciente.encolar(new Paciente("Karen","Lopez",19));
        System.out.println("Atendiendo a : " + paciente.desEncolar());
        System.out.println(paciente);
    }
}
