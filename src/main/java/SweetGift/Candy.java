package SweetGift;

public class Candy extends Gift  {
    private String type;

    public Candy(String tovar, double price, double weight, String type) {
        super(tovar, price, weight);
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void setType() {
        this.type = this.type;
    }

    public String toString() {
        return "Candy: [" + super.toString() + " Тип: " + this.type + "]";
    }
}

