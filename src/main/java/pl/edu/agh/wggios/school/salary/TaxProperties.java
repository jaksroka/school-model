package pl.edu.agh.wggios.school.salary;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;

import java.util.function.Function;

@Getter
@Builder
public class TaxProperties {

    @Getter(AccessLevel.PRIVATE)
    private Double costOfGettingIncomePercent;
    @Getter(AccessLevel.PRIVATE)
    private Double costOfGettingIncomeCalculationBasisPercent;
    @Getter(AccessLevel.PRIVATE)
    private Double costOfGettingIncomeAmount;
    private Function<Integer, Double> seniorityPay;

    public Function<Double, Double> getCostOfGettingIncome() {
        return (grossSalary) -> costOfGettingIncomeAmount == null ? grossSalary * costOfGettingIncomeCalculationBasisPercent * costOfGettingIncomePercent : costOfGettingIncomeAmount;
    }
}
