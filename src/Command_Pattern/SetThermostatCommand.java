package Command_Pattern;

public class SetThermostatCommand implements Command {
    private final Thermostat thermostat;
    private final int temperature;

    public SetThermostatCommand(Thermostat thermostat, int temperature) {
        this.thermostat = thermostat;
        this.temperature = temperature;
    }

    @Override
    public void execute() {
        thermostat.setTemperature(temperature);
    }

    @Override
    public void undo() {
        thermostat.revertTemperature();
    }
}

