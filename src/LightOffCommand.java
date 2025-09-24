public class LightOffCommand implements Command {
    private Light light;
    private int prevBrightness;
    private boolean prevState;

    public LightOffCommand(Light light) { this.light = light; }

    @Override
    public void execute() {
        prevState = light.isOn();
        prevBrightness = light.getBrightness();
        light.off();
    }

    @Override
    public void undo() {
        light.setBrightness(prevBrightness);
    }
}
