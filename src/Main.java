public class Main {

    public static void main(String[] args) {
        Masina audi = new Masina();
        System.out.println(audi.getColor());
        System.out.println(audi.getModel());
        System.out.println(audi.getVolumMotor());
        System.out.println(audi.getMaxSpeed());
        System.out.println(audi.getGear());

        Masina volvo = new Masina("Volvo", 2.4, 0);
        System.out.println();
        System.out.println(volvo.getColor());
        System.out.println(volvo.getModel());
        System.out.println(volvo.getVolumMotor());
        System.out.println(volvo.getMaxSpeed());
        System.out.println(volvo.getGear());

        volvo.startEngine();
        volvo.startEngine(5, "brrr");
        volvo.transportToDestination("Durlesti");

//        Vehicle bicicleta = new Vehicle(60, "Orange");
        NonWheeledVehicles bicicleta = new NonWheeledVehicles();
        System.out.println(bicicleta.getColor());
        System.out.println(bicicleta.getMaxSpeed());
        bicicleta.transportToDestination("Centru");
    }
}
