package Command_Pattern;

import java.util.HashMap;
import java.util.Map;

public class SmartHomeRemoteControl {
    private final Map<String, Command> slots = new HashMap<>();
    private Command lastCommand;

    public void setCommand(String slot, Command command) {
        slots.put(slot, command);
    }

    public void pressButton(String slot) {
        Command command = slots.get(slot);
        if (command != null) {
            command.execute();
            lastCommand = command;
        }
    }

    public void pressUndo() {
        if (lastCommand != null) {
            System.out.println("Undo last command");
            lastCommand.undo();
        }
    }
}

