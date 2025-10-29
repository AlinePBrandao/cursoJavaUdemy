package M13_ClassesMetodosAbstratos.Taxes.entities;

public class Individual extends TaxPayer {

    private Double healthcareExpenses;

    public Individual(String name, Double annualIncome, Double healthcareExpenses) {
        super(name, annualIncome);
        this.healthcareExpenses = healthcareExpenses;
    }

    public Double getHealthcareExpenses() {
        return healthcareExpenses;
    }

    public void setHealthcareExpenses(Double healthcareExpenses) {
        this.healthcareExpenses = healthcareExpenses;
    }

    @Override
    public double tax() {
        // TODO: retornar taxa = annuelIncome * taxa
        return getAnnualIncome() * ;
    }
}
