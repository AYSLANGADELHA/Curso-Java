package entities;

public class Employee {

    private String name;
    private Integer hour;
    private Double valuePerHour;

    public Employee(){};

    public Employee(String name, Integer hour, Double valuePerHour){
        this.name = name;
        this.hour = hour;
        this.valuePerHour = valuePerHour;
    }

    public String getName() {
        return name;
    }

    public Integer getHour() {
        return hour;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public double payment(){
        return  hour * valuePerHour;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ");
        sb.append(getName() +  "\n");
        sb.append("Hour: ");
        sb.append(getHour() + "\n");
        sb.append("Value per hour: " + "\n");
        sb.append(getValuePerHour());
        return sb.toString();
    }
}
