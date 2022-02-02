import lombok.Data;

@Data
public class City {
    private String name;
    private String country;
    private String area;
    private int population;

    public City(String name, String country, String area, int population) {
        this.name = name;
        this.country = country;
        this.area = area;
        this.population = population;
    }

    public City() {
        this.name = "none";
        this.country = "none";
        this.area = "0";
        this.population = 0;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", area=" + area +
                ", population=" + population +
                '}';
    }
}
