package pl.edu.agh.wggios.school.person;

import lombok.Getter;
import pl.edu.agh.wggios.school.salary.TaxProperties;

@Getter
public class AdministrationEmployee extends Employee {

    private static final TaxProperties TAX_PROPERTIES = TaxProperties.builder()
            .costOfGettingIncome(0.5)
            .costOfGettingIncomeCalculationBasis(1.0)
            .seniorityPay(seniority -> 0.0).build();

    private final String position;

    protected AdministrationEmployee(String id, String name, String surname, int age, Male male, String position, double grossSalary, int seniority) {
        super(id, name, surname, age, male, TAX_PROPERTIES, grossSalary, seniority);
        this.position = position;
    }
}
