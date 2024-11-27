public class Car {

    private String brand;
    private String model;
    private int year;
    private boolean isEngineOn;

    public Car(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.isEngineOn = false; //by default engine is off
    }

    public void turnEngineOn() {
        isEngineOn = true;
        System.out.println("Engine turned on.");
    }

    public void turnEngineOff() {
        isEngineOn = false;
        System.out.println("Engine turned off.");
    }

    public String getCarInfo() {
        return "Brand: " + brand + ", Model: " + model + ", Year: " + year + ", Engine state: " + (isEngineOn ? "ON" : "OFF");
    }

}
