package CommandPattern;

public class CentralHub {
    private Command scheduledCommand;
    private Command eventCommand;
    private Command alertCommand;

    // Setters for each command
    public void setScheduledCommand(Command command) {
        this.scheduledCommand = command;
    }

    public void setEventCommand(Command command) {
        this.eventCommand = command;
    }

    public void setAlertCommand(Command command) {
        this.alertCommand = command;
    }

    // Methods to execute each command
    public void runScheduled() {
        if (scheduledCommand != null) scheduledCommand.execute();
    }

    public void triggerEvent() {
        if (eventCommand != null) eventCommand.execute();
    }

    public void sendAlert() {
        if (alertCommand != null) alertCommand.execute();
    }
}
// ...existing code...
    }
    public void pressButton(String action) {
        if (commandMap.containsKey(action)) {
            commandMap.get(action).execute();
        } else {
            System.out.println("No command assigned for action: " + action);
        }
    }
}