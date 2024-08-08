package entities;

public class Individual extends People {

    private Double healthcareExpenses;

    public Individual() {
        super();
    }

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
        // double basicTax = (getAnnualIncome() < 20000.0) ? getAnnualIncome() * 0.15 : getAnnualIncome() * 0.25;
        if (getAnnualIncome() < 20000.0) {
            return getAnnualIncome() * 0.15 - healthcareExpenses * 0.5;
        }
        else {
            return getAnnualIncome() * 0.25 - healthcareExpenses * 0.5;
        }

    }


    // double basicTax = (getAnnualIncome() < 20000.0) ? getAnnualIncome() * 0.15 : getAnnualIncome() * 0.25;
        /*
        basicTax = basicTax - getHealthcareExpenses() * 0.5;
        if (basicTax < 0.0){
            return 0.0;
        }
        else{
            return basicTax;
        }

         */
}