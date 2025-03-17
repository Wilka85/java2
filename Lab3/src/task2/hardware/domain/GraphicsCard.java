package task2.hardware.domain;

public class GraphicsCard extends Hardware {
    private int memory;
    private String chipset;

    public GraphicsCard(String model, String manufacturer, double price, int memory, String chipset) {
        super(model, manufacturer, price);
        this.memory = memory;
        this.chipset = chipset;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }
}
