public class LightOnCommand implements Command {
    private Light light;
    private int prevBrightness;
    private boolean prevState;
    private int brightness;

    public LightOnCommand(Light light) { this(light, 100); }
    public LightOnCommand(Light light, int brightness) {
        this.light = light;
        this.brightness = brightness;
    }

    @Override
    public void execute() {
        prevState = light.isOn();
        prevBrightness = light.getBrightness();
        light.setBrightness(brightness);
    }

    @Override
    public void undo() {
        light.setBrightness(prevBrightness);
        if (!prevState) System.out.println("Undo: restored previous state (was off)");
    }
}
