public class NonWheeledVehicles extends  Vehicle {
    @Override
    public void signal(String color) {
        System.out.println("Signal with " + color + " color");
    }
}
