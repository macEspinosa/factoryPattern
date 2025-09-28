import java.util.*;

public class Scheduler {
    private final Timer timer = new Timer();
    public void schedule(Command command, long delayMs) {
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                command.execute();
            }
        }, delayMs);
    }
}