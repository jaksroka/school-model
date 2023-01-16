package pl.edu.agh.wggios.school;

public class Admin extends Worker {

    private static final double COST_OF_GETTING_INCOME = 3600.0; //zakładmy że pracownicy administracji dojeżdzają z innej miejscowości i mają tylko jeden stosunek pracy
    private String position;

    public Admin(String name, int age, double grossSalary, String position) {
        super(name, age, grossSalary);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public double getNetSalary() {
        double incomeTax = Worker.TAX * (getGrossSalary() * 12 - COST_OF_GETTING_INCOME - Worker.TAX_FREE_ALLOWANCE);
        incomeTax = incomeTax > 0 ? incomeTax : 0;
        return getGrossSalary() - incomeTax / 12;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "position='" + position + '\'' +
                ", grossSalary=" + getGrossSalary() +
                ", netSalary=" + getNetSalary() +
                ", mName='" + getName() + '\'' +
                ", mAge=" + getAge() +
                '}';
    }
}
