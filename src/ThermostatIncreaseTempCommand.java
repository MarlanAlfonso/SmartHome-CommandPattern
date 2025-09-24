public class ThermostatIncreaseTempCommand implements Command {
    private Thermostat thermostat;
    private double delta;

    public ThermostatIncreaseTempCommand(Thermostat thermostat, double delta) {
        this.thermostat = thermostat; this.delta = delta;
    }

    @Override
    public void execute() { thermostat.increase(delta); }

    @Override
    public void undo() { thermostat.decrease(delta); }
}
