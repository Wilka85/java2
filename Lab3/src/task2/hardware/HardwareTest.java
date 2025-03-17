package task2.hardware;
import task2.hardware.domain.*;

public class HardwareTest {
    public static void main(String[] args) {
        Processor processor = new Processor("Ryzen AAA", "AMD", 100.00, 10, 7.7);

        GraphicsCard graphicsCard = new GraphicsCard("RTX BBB", "NVIDIA", 1000.00, 20, "Amperes");

        Monitor monitor = new Monitor("XXX", "Dell", 257.77, 29, "8K");

        HardDrive hardDrive = new HardDrive("HHH", "Alexis", 777.77, 10000, "SSD");

        System.out.println("Processor: " + processor.getModel() + ", " + processor.getManufacturer() + ", " + processor.getPrice() + "$, " + processor.getCores() + " cores, " + processor.getFrequency() + "GHz");
        System.out.println("Graphics Card: " + graphicsCard.getModel() + ", " + graphicsCard.getManufacturer() + ", " + graphicsCard.getPrice() + "$, " + graphicsCard.getMemory() + "GB, " + graphicsCard.getChipset());
        System.out.println("Monitor: " + monitor.getModel() + ", " + monitor.getManufacturer() + ", " + monitor.getPrice() + "$, " + monitor.getSize() + " inches, " + monitor.getResolution());
        System.out.println("Hard Drive: " + hardDrive.getModel() + ", " + hardDrive.getManufacturer() + ", " + hardDrive.getPrice() + "$, " + hardDrive.getCapacity() + "GB, " + hardDrive.getType());
    }
}
