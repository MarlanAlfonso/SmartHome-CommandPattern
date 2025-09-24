public class Thermostat {
    private double temperature = 22.0;

    public void setTemperature(double temp) {
        System.out.println("Thermostat: temperature set from " + temperature + " to " + temp);
        temperature = temp;
    }

    public void increase(double delta) { setTemperature(temperature + delta); }
    public void decrease(double delta) { setTemperature(temperature - delta); }
    public double getTemperature() { return temperature; }
}
