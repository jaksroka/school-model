package pl.edu.agh.wggios.school;

public class Teacher extends Worker {

    private static final double COST_OF_GETTING_INCOME = 0.5;
    private static final double COST_OF_GETTING_INCOME_BASE = 0.8;

    private Subject subject;
    private int seniority;

    public Teacher(String name, int age, double grossSalary, Subject subject, int seniority) {
        super(name, age, grossSalary);
        this.subject = subject;
        this.seniority = seniority;
    }

    public Subject getSubject() {
        return subject;
    }

    @Override
    public double getNetSalary() {
        double incomeTax = Worker.TAX * (getGrossSalary() * 12 - COST_OF_GETTING_INCOME_BASE * COST_OF_GETTING_INCOME * getGrossSalary() * 12 - Worker.TAX_FREE_ALLOWANCE);
        incomeTax = incomeTax > 0 ? incomeTax : 0;
        return getGrossSalary() - incomeTax / 12;
    }

    @Override
    public double getGrossSalary() {
        int seniorityBonusPercent = Math.min(seniority, 20);
        seniorityBonusPercent = ( seniorityBonusPercent >= 5 ) ? seniorityBonusPercent : 0;
        return super.getGrossSalary() * (1 + (double) seniorityBonusPercent / 100);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subject=" + subject +
                ", seniority=" + seniority +
                ", grossSalary=" + getGrossSalary() +
                ", netSalary=" + getNetSalary() +
                ", mName='" + getName() + '\'' +
                ", mAge=" + getAge() +
                '}';
    }
}

