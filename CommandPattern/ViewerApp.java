package commandPattern;

public class ViewerApp {
    public static void main(String[] args) throws InterruptedException {
        // Devices
        Light light = new Light();
        Thermostat thermostat = new Thermostat();
        MusicPlayer musicPlayer = new MusicPlayer();
        DoorSensor doorSensor = new DoorSensor();

        // Commands
        Command turnOnLight = new TurnOnLightCommand(light);
        Command increaseTemp = new IncreaseTempCommand(thermostat);
        Command playMusic = new PlayMusicCommand(musicPlayer, "Morning Playlist");
        Command sendAlert = new SendAlertCommand(doorSensor);

        // Central Hub
        CentralHub hub = new CentralHub();
        hub.setCommand("TurnOnLight", turnOnLight);
        hub.setCommand("IncreaseTemp", increaseTemp);
        hub.setCommand("PlayMusic", playMusic);
        hub.setCommand("SendAlert", sendAlert);

        // 1. Scheduling and Automation
        System.out.println("\n--- Scheduling: Turn on light in 2 seconds ---");
        Scheduler scheduler = new Scheduler();
        scheduler.schedule(turnOnLight, 2000); // 2 seconds

        // 2. Event-Based Triggers
        System.out.println("\n--- Event: Motion Detected triggers Play Music ---");
        EventManager eventManager = new EventManager();
        eventManager.registerEvent("MotionDetected", playMusic);
        eventManager.triggerEvent("MotionDetected");

        // 3. Security Alerts and Notifications
        System.out.println("\n--- Security: Door opens unexpectedly ---");
        if (doorSensor.isOpen()) {
            hub.pressButton("SendAlert");
        }

        // Wait for scheduled task to finish
        Thread.sleep(2500);
        System.out.println("\n--- Demo Complete ---");
    }
}
        PowerOn powerOn = new PowerOn(tv);
        System.out.println(powerOn.execute());

        PowerOff powerOff = new PowerOff(tv);
        System.out.println(powerOff.execute());
    }
}