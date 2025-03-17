package task2.hardware.domain;

public class Processor extends Hardware {
    private int cores;
    private double frequency;

    public Processor(String model, String manufacturer, double price, int cores, double frequency) {
        super(model, manufacturer, price);
        this.cores = cores;
        this.frequency = frequency;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }
}
