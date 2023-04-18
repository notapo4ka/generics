public class Fruit {

    private String name;
    private String country;

    public Fruit(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}