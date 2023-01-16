package pl.edu.agh.wggios.school;

public abstract class Worker extends Person {

    protected static final double TAX_FREE_ALLOWANCE = 30000.0;
    protected static final double TAX = 0.18;

    private double grossSalary;

    public Worker(String name, int age, double grossSalary) {
        super(name, age);
        this.grossSalary = grossSalary;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public abstract double getNetSalary();
}
