public class Thermostat {
    private int temperature = 22;
    public void increaseTemperature() {
        temperature++;
        System.out.println("Thermostat increased to " + temperature + "°C");
    }
    public void decreaseTemperature() {
        temperature--;
        System.out.println("Thermostat decreased to " + temperature + "°C");
    }
}