public class Masina extends WheeledVehicle implements Tunable{

    private String model;
    private double volumMotor;
    private int gear;


    public Masina(String color, String model, double volumMotor, int maxSpeed, int gear) {
        super.setColor(color);
        this.model = model;
        this.volumMotor = volumMotor;
        super.setMaxSpeed(maxSpeed);
        this.gear = gear;
    }

    public Masina(String model, double volumMotor, int gear) {
        this.model = model;
        this.volumMotor = volumMotor;
        this.gear = gear;
    }

    public Masina(){
        super.setColor("White");
        this.model = "Audi";
        this.volumMotor = 3.2;
        this.setMaxSpeed(250);
        this.gear = 0;
    }


    public int acceperate() {
        return 0;
    }

    public boolean startEngine() {
        System.out.println("The engine has started");
        return true;
    }

    public void startEngine(int gear, String engineSound) {
        System.out.println("The engine is working at " + gear + " gear");
    }

    public void startEngine(String engineSound, int gear) {
        System.out.println("The engine is working at " + gear + " gear");
    }

    public void changeGear(int gearNumber) {
        this.gear = gearNumber;
    }

//    public String getColor() {
//        return this.color;
//    }
//
//    public void setColor(String newColor) {
//        if (newColor.equals("Black") || newColor.equals("White")) {
//            this.color = newColor;
//        }
//    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getVolumMotor() {
        return volumMotor;
    }

    public void setVolumMotor(double volumMotor) {
        this.volumMotor = volumMotor;
    }

//    public int getMaxSpeed() {
//        return maxSpeed;
//    }
//
//    public void setMaxSpeed(int maxSpeed) {
//        this.maxSpeed = maxSpeed;
//    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    @Override
    public void transportToDestination(String destination){
        System.out.println("You drive to " + destination + " by car");
    }

    @Override
    public void signal(String color) {
        System.out.println("Beep beep with " + color + " color");
    }

    @Override
    public void changeEngineSound(String newSound) {

    }

    @Override
    public int changeFlySpeed(int newSpeed) {
        return 0;
    }

    @Override
    public void land() {

    }

    @Override
    public void decolare() {

    }
}
