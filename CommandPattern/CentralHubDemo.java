package CommandPattern;

// Demo for using CentralHub for scheduling and alerts (no HashMap, no EventManager)
public class CentralHubDemo {
    public static void main(String[] args) {
        Light light = new Light();
        Command turnOnLight = new TurnOnLightCommand(light);

        MusicPlayer player = new MusicPlayer();
        Command playMusic = new PlayMusicCommand(player);

        CentralHub hub = new CentralHub();
        // Simulate scheduling: set and run scheduled command
        hub.setScheduledCommand(turnOnLight);
        System.out.println("Running scheduled command:");
        hub.runScheduled();

        // Simulate alert: set and send alert command
        hub.setAlertCommand(playMusic);
        System.out.println("Sending alert command:");
        hub.sendAlert();
    }
}
