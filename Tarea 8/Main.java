package unam.mx.colas;

public class Main {
    public static void main(String[] args) {
        ColaConPrioridadAcotada<ClienteBanco> cliente = new ColaConPrioridadAcotada<>(5);

        cliente.encolar(4,new ClienteBanco("Cliente Nuevo", "Diego Hernandez",5000));
        cliente.encolar(4,new ClienteBanco("Cliente Nuevo", "Alex Herrera",1000));
        cliente.encolar(5,new ClienteBanco("No es cliente","Jose Perez", 0));
        cliente.encolar(5,new ClienteBanco("No es cliente","Adrian Castillo", 200));
        cliente.encolar(5,new ClienteBanco("No es cliente","Alejandro Suarez", 5000));
        cliente.encolar(1,new ClienteBanco("Celebridad","Karol G",1900000));
        System.out.println(cliente);
        ClienteBanco clienteAtendido = cliente.desEncolar();
        clienteAtendido.retirar(10000);
        cliente.encolar(3,new ClienteBanco("Cliente Frecuente","Karen Rodriguez",50000));
        cliente.encolar(2,new ClienteBanco("Cliente Premium","Arturo Islas",1500000));
        System.out.println("Atendiendo a : " + cliente.desEncolar());
        System.out.println(cliente);
        System.out.println("Atendiendo a : " + cliente.desEncolar());
        System.out.println("Atendiendo a : " + cliente.desEncolar());
        System.out.println("Atendiendo a : " + cliente.desEncolar());
        System.out.println("Atendiendo a : " + cliente.desEncolar());
        System.out.println("Atendiendo a : " + cliente.desEncolar());
        System.out.println("Atendiendo a : " + cliente.desEncolar());
        System.out.println(cliente);
    }
}
