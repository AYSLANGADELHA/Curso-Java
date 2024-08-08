package entities;

public class OutsourceEmployee extends Employee {

    private Double additionalCharge;

    public OutsourceEmployee(){
        super();
    }

    public OutsourceEmployee(String name, Integer hour, Double valuePerHour, Double additionalCharge){
        super (name, hour, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment(){
        return  super.payment() + additionalCharge * 1.1;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ");
        sb.append(getName() +  "\n");
        sb.append("Hour: ");
        sb.append(getHour() + "\n");
        sb.append("Value per hour: ");
        sb.append(getValuePerHour() + "\n");
        sb.append("Additional charge: ");
        sb.append(getAdditionalCharge() + "\n");
        return sb.toString();


    }
}
