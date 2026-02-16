package labworks;

public class Temperature {
    private double temperature;
    private char scale; // 'C' or 'F'

    // default constructor: 0C
    public Temperature() {
        this.temperature = 0.0;
        this.scale = 'C';
    }

    // one for each instance field
    public Temperature(char scale) {
        this.temperature = 0.0;
        this.scale = normalizeScale(scale);
    }

    // one for each instance field
    public Temperature(double temperature) {
        this.temperature = temperature;
        this.scale = 'C';
    }

    // two-parameter constructor
    public Temperature(double temperature, char scale) {
        this.temperature = temperature;
        this.scale = normalizeScale(scale);
    }

    // (1) return temperature in C
    public double getCelsius() {
        if (scale == 'C') return temperature;
        // C = 5(F - 32)/9
        return 5.0 * (temperature - 32.0) / 9.0;
    }

    // (1) return temperature in 
    public double getFahrenheit() {
        if (scale == 'F') return temperature;
        // F = 9(C/5) + 32
        return 9.0 * (temperature / 5.0) + 32.0;
    }

    // (2) setters
    public void setValue(double temperature) {
        this.temperature = temperature;
    }

    public void setScale(char scale) {
        this.scale = normalizeScale(scale);
    }

    public void setBoth(double temperature, char scale) {
        this.temperature = temperature;
        this.scale = normalizeScale(scale);
    }

    // (3) return scale
    public char getScale() {
        return scale;
    }

    private char normalizeScale(char s) {
        char up = Character.toUpperCase(s);
        if (up != 'C' && up != 'F') {
            return 'C';
        }
        return up;
    }
}
