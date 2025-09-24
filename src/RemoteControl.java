import java.util.HashMap;
import java.util.Map;

public class RemoteControl {
    private Map<String, Command> commands = new HashMap<>();
    private Command lastCommand = new NoCommand();

    public void setCommand(String name, Command cmd) { commands.put(name, cmd); }

    public void press(String name) {
        Command cmd = commands.getOrDefault(name, new NoCommand());
        System.out.println("\n[Remote] -> pressing '" + name + "'");
        cmd.execute();
        lastCommand = cmd;
    }

    public void undo() {
        System.out.println("\n[Remote] -> undo");
        lastCommand.undo();
    }

    public void listCommands() {
        System.out.println("Configured commands:");
        for (String k : commands.keySet()) System.out.println(" - " + k);
    }
}
