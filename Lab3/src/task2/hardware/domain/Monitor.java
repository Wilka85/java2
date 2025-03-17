package task2.hardware.domain;

public class Monitor extends Hardware {
    private int size;
    private String resolution;

    public Monitor(String model, String manufacturer, double price, int size, String resolution) {
        super(model, manufacturer, price);
        this.size = size;
        this.resolution = resolution;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }
}
