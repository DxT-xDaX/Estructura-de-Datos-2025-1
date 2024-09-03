

public class ListaADTMain {
    public static void main(String[] args) {
    
        ListaLigada<SmartPhone> smartphones = new ListaLigada<>();

        SmartPhone smartphone1 = new SmartPhone("Huawei",2018,"A2");
        SmartPhone smartphone2 = new SmartPhone("Motorola",2016,"Moto G");
        SmartPhone smartphone3 = new SmartPhone("Samsung",2018,"A52");
        SmartPhone smartphone4 = new SmartPhone("Phone",2018,"15");
        SmartPhone smartphone5 = new SmartPhone("Honor",2018,"X3");
        smartphones.agregarAlFinal(smartphone1);
        smartphones.agregarAlFinal(smartphone2);
        smartphones.agregarAlFinal(smartphone3);
        smartphones.agregarAlFinal(smartphone4);
        smartphones.agregarAlFinal(smartphone5);

        smartphones.transversal();
        System.out.println("");

        smartphones.eliminar(2);
        smartphones.transversal();
        System.out.println("");

        SmartPhone smartphonenvo = new SmartPhone("Alcatel",2008, "M2");
        smartphones.actualizar(2, smartphonenvo);
        smartphones.agregarAlInicio(new SmartPhone("Realme",2020,"C2"));
        smartphones.agregarAlFinal(new SmartPhone("Poco", 2023, "X6 Pro"));
        smartphones.transversal();
        System.out.println("");

        smartphones.eliminarElPrimero();
        smartphones.transversal();
        System.out.println("");

    }
}
