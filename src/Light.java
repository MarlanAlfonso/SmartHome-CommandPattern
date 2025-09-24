public class Light {
    private String name;
    private boolean on = false;
    private int brightness = 100; // 0-100

    public Light(String name) { this.name = name; }

    public void on() {
        on = true;
        System.out.println(name + " is ON (brightness=" + brightness + ")");
    }

    public void off() {
        on = false;
        System.out.println(name + " is OFF");
    }

    public void setBrightness(int level) {
        level = Math.max(0, Math.min(100, level));
        System.out.println(name + " brightness from " + brightness + " -> " + level);
        brightness = level;
        if (brightness > 0) on = true; else on = false;
    }

    public int getBrightness() { return brightness; }
    public boolean isOn() { return on; }
}
