package SweetGift;

public abstract class Gift {
    private String tovar;
    private double price;
    private double weight;

    public Gift(String tovar, double price, double weight) {
        this.tovar = tovar;
        this.price = price;
        this.weight = weight;
    }

    public String getTovar() {
        return this.tovar;
    }

    public double getPrice() {
        return this.price;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setTovar(String tovar) {
        this.tovar = tovar;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String toString() {
        return "Товар: " + this.tovar + " Вес: " + this.weight + " Цена: " + this.price;
    }
}

