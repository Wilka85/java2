package task2.hardware.domain;

public class HardDrive extends Hardware {
    private int capacity;
    private String type;

    public HardDrive(String model, String manufacturer, double price, int capacity, String type) {
        super(model, manufacturer, price);
        this.capacity = capacity;
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
