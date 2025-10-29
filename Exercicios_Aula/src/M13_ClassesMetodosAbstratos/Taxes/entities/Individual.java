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
    public double tax(){
        //NOTE: Expressão Condicional Ternaria
        double basicTax = (getAnnualIncome() < 20000.0) ? getAnnualIncome() * 0.15 :  getAnnualIncome() * 0.25;

        basicTax = basicTax - (getHealthcareExpenses() * 0.5);
        if (basicTax < 0.0){ // NOTE: caso o gasto com saude seja maior que o valor a pagar, o retorno será 0.
            basicTax = 0.0;
        }
        return basicTax;
    }

}
