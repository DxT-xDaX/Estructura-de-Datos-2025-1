
public class SmartPhone {
    private String marca;
    private int ano;
    private String modelo;

    public SmartPhone() {
    }

    public SmartPhone(String marca, int ano, String modelo) {
        this.marca = marca;
        this.ano = ano;
        this.modelo = modelo;
    }

    public String getMarca(String marca) {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setano(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "["+marca + ", " + ano +", " + modelo +"]";
    }
}
