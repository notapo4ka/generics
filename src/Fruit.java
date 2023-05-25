public class Fruit {

    private String name;
    private String country;
    private double weight;

    public Fruit(String name, String country, double weight) {
        this.name = name;
        this.country = country;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", weight=" + weight +
                '}';
    }
}