public class ThermostatDecreaseTempCommand implements Command {
    private Thermostat thermostat;
    private double delta;

    public ThermostatDecreaseTempCommand(Thermostat thermostat, double delta) {
        this.thermostat = thermostat; this.delta = delta;
    }

    @Override
    public void execute() { thermostat.decrease(delta); }

    @Override
    public void undo() { thermostat.increase(delta); }
}
