public class Light {
    private boolean isOn = false;
    public void turnOn() {
        isOn = true;
        System.out.println("Light is ON");
    }
    public void turnOff() {
        isOn = false;
        System.out.println("Light is OFF");
    }
    public void setBrightness(int level) {
        System.out.println("Light brightness set to " + level);
    }
}