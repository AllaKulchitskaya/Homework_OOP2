public class Flower {
    private String flowerName;
    private String country;
    private double cost;
    private int lifeSpan;

    public Flower (String flowerName, String country, double cost, int lifeSpan) {
        setFlowerName(flowerName);
        setCountry(country);
        setCost(cost);
        setLifeSpan(lifeSpan);
    }

    public Flower (String flowerName, String country, double cost) {
        this(flowerName, country, cost, 3);
    }

    public String getFlowerName() {
        return flowerName;
    }

    public String getCountry() {
        return country;
    }

    public double getCost() {
        return cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
        if (this.flowerName == null || this.flowerName.isBlank() || this.flowerName.isEmpty()) {
            this.flowerName = "Тип цветка не указан";
        }
    }

    public void setCountry(String country) {
        this.country = country;
        if (this.country == null || this.country.isBlank() || this.country.isEmpty()) {
            this.country = "Россия";
        }
    }

    public void setCost(double cost) {
        this.cost = cost;
        if (this.cost <= 0) {
            this.cost = 1;
        }
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
        if (this.lifeSpan <= 0) {
            this.lifeSpan = 3;
        }
    }

    public String toString() {
        return "Название - " + this.flowerName + ", страна происхождения - " + this.country + ", стоимость за шутку - "
                + this.cost + ", срок стояния в днях - " + this.lifeSpan;
    }
}
