public abstract class Vehicle {
    private int maxSpeed;
    private String color;

    public Vehicle() {
        this.maxSpeed = 30;
        this.color = "Black";
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void transportToDestination(String destination){
        System.out.println("You are now at " + destination);
    }

    public abstract void signal(String color);
}
