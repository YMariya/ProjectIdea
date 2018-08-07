package SweetGift;

public class Chocolate extends Gift  {
    private String color;

    public Chocolate(String tovar, double price, double weight, String color) {
        super(tovar, price, weight);
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor() {
        this.color = this.color;
    }

    public String toString() {
        return "Chocolate [" + super.toString() + " Цвет: " + this.color + "]";
    }
}
