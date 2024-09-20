package unam.mx.colas;

public class ClienteBanco {
    private String cliente;
    private String nombre;
    private double saldo;

    public ClienteBanco() {
    }

    public ClienteBanco(String cliente, String nombre, double saldo) {
        this.cliente = cliente;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
  
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void retirar(double monto) {
        if (this.saldo >= monto) {
            this.saldo -= monto;
            System.out.println(nombre + " retiro $" + monto + ". Nuevo saldo: $" + saldo);
        }
    }

    @Override
    public String toString() {
        return "Cliente: '" + nombre + "', Saldo: $" + saldo + ", Tipo de cliente: " + cliente;
    }
}
