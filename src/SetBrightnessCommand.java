public class SetBrightnessCommand implements Command {
    private Light light;
    private int prevBrightness;
    private int brightness;

    public SetBrightnessCommand(Light light, int brightness) {
        this.light = light; this.brightness = brightness;
    }

    @Override
    public void execute() {
        prevBrightness = light.getBrightness();
        light.setBrightness(brightness);
    }

    @Override
    public void undo() {
        light.setBrightness(prevBrightness);
    }
}
