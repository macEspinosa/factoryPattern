public class SendAlertCommand implements Command {
    private DoorSensor sensor;
    public SendAlertCommand(DoorSensor sensor) {
        this.sensor = sensor;
    }
    @Override
    public void execute() {
        sensor.detectUnusualActivity();
        System.out.println("Alert sent to user's phone!");
    }
}