package pl.edu.agh.wggios.school.salary;

public class SalaryConverter {

    private static final double TAX_FREE_ALLOWANCE = 30000.0;
    private static final double FIRST_TAX_VALUE = 0.12;
    private static final double SECOND_TAX_THRESHOLD = 120000.0;
    private static final double SECOND_TAX_VALUE = 0.32;
    private static final int YEAR_LENGTH = 12;

    public static double gross2net(TaxProperties taxProperties,
                                   double grossSalary,
                                   int seniority) {
        double totalGrossSalary = (1 + taxProperties.getSeniorityPay().apply(seniority)) * grossSalary * YEAR_LENGTH;
        double tax_basis = totalGrossSalary - taxProperties.getCostOfGettingIncome().apply(totalGrossSalary) - TAX_FREE_ALLOWANCE;

        if (tax_basis < 0) {
            return grossSalary;
        }

        double tax;
        if (tax_basis < SECOND_TAX_THRESHOLD) {
            tax = tax_basis * FIRST_TAX_VALUE;
        } else {
            tax = (SECOND_TAX_THRESHOLD - TAX_FREE_ALLOWANCE) * FIRST_TAX_VALUE + (tax_basis - SECOND_TAX_THRESHOLD) * SECOND_TAX_VALUE;
        }

        return grossSalary - tax / YEAR_LENGTH;
    }
}
