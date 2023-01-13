package pl.edu.agh.wggios.school.person;

import lombok.Getter;
import pl.edu.agh.wggios.school.salary.SalaryConverter;
import pl.edu.agh.wggios.school.salary.TaxProperties;

@Getter
public abstract class Employee extends Person implements Employable {

    private TaxProperties taxProperties;
    private double grossSalary;
    private int seniority;

    public Employee(String id, String name, String surname, int age, Male male, TaxProperties taxProperties, double grossSalary, int seniority) {
        super(id, name, surname, age, male);
        this.taxProperties = taxProperties;
        this.grossSalary = grossSalary;
        this.seniority = seniority;
    }

    @Override
    public double calculateNetSalary() {
        return SalaryConverter.gross2net(taxProperties, grossSalary, seniority);
    }
}
