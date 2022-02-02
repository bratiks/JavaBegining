import lombok.Data;

@Data
public class Country {
    private String name;
    private  City capital;
    private String language;

    private int timeZone;

    private String area;
    private  int population;

    public Country(String name, City capital, String language, int timeZone, String area, int population) {
        this.name = name;
        this.capital = capital;
        this.language = language;

        this.timeZone = timeZone;

        this.area = area;
        this.population = population;
    }

    public Country() {
        this.name = "none";
        this.capital = new City();
        this.language = "none";

        this.timeZone = -100;

        this.area = "0";
        this.population = 0;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", capital='" + capital.toString() + '\'' +
                ", language='" + language + '\'' +
                ", timeZone=" + "UTC" + timeZone +
                ", area=" + area +
                ", population=" + population +
                '}';
    }
}
