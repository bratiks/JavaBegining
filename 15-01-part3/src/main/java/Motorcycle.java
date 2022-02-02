import lombok.Data;

@Data
public class Motorcycle {
    private String name;
    private String manufacturer;

    private int yearOfProduction;
    private int engineCapacity;

    public Motorcycle(String name, String manufacturer, int yearOfProduction, int engineCapacity) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public Motorcycle() {
        this.name = "name";
        this.manufacturer = "manufacturer";
        this.yearOfProduction = 0;
        this.engineCapacity = 0;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "name='" + name + '\'' +
                ", Manufacturer='" + manufacturer + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", engineCapacity=" + engineCapacity + "см. куб." +
                '}';
    }
}
