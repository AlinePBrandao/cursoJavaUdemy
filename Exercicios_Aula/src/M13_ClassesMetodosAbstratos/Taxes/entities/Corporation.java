package M13_ClassesMetodosAbstratos.Taxes.entities;

public class Corporation  extends TaxPayer{

    private Integer totalEmployees;

    public Corporation(String name, Double annualIncome, Integer totalEmployees) {
        super(name, annualIncome);
        this.totalEmployees = totalEmployees;
    }

    public Integer getTotalEmployees() {
        return totalEmployees;
    }

    public void setTotalEmployees(Integer totalEmployees) {
        this.totalEmployees = totalEmployees;
    }

    @Override
    public double tax() {
        //NOTE: Expressão Condicional Ternaria
        double basicTax = (totalEmployees > 10) ? getAnnualIncome() * 0.14 : getAnnualIncome() * 0.16;

        return basicTax;
    }





}
