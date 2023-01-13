package pl.edu.agh.wggios.school.person;

import pl.edu.agh.wggios.school.salary.TaxProperties;

import static java.lang.Math.min;

public class Teacher extends Employee {

    private static final TaxProperties TAX_PROPERTIES = TaxProperties.builder()
            .costOfGettingIncome(0.5)
            .costOfGettingIncomeCalculationBasis(0.8)
            .seniorityPay(seniority -> {
                double p = min(seniority, 20);
                return p < 5 ? 0 : p/100;
            }).build();

    protected Teacher(String id, String name, String surname, int age, Male male, double grossSalary, int seniority) {
        super(id, name, surname, age, male, TAX_PROPERTIES, grossSalary, seniority);
    }

}
