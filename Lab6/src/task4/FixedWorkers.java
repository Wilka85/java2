package task4;

public class FixedWorkers extends Employee {
    private double zp;

    public FixedWorkers(String name, double zp) {
        super(name);
        this.zp = zp;
    }

    @Override
    public double calculator() {
        return zp;
    }
}

