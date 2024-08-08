package entities;

public abstract class People {

    private String name;
    private Double annualIncome;

    public People(){
    }

    public People(String name, Double annualIncome){
        this.name = name;
        this.annualIncome = annualIncome;
    }

    public String getName() {
        return name;
    }

    public Double getAnnualIncome() {
        return annualIncome;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAnnualIncome(Double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public abstract double tax();
}
