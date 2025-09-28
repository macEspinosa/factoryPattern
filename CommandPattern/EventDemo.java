package CommandPattern;

// Simplest demo: one device, one command, one event
public class EventDemo {
    public static void main(String[] args) {
        Light light = new Light();
        Command turnOnLight = new TurnOnLightCommand(light);
        EventManager eventManager = new EventManager();
        eventManager.setEventCommand(turnOnLight);
        eventManager.triggerEvent();
    }
}
