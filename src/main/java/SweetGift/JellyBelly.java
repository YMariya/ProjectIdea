package SweetGift;

public class JellyBelly extends Gift {
    private String vkus;

    public JellyBelly(String tovar, double price, double weight, String vkus) {
        super(tovar, price, weight);
        this.vkus = vkus;
    }

    public String getVkus() {
        return this.vkus;
    }

    public void setVkus() {
        this.vkus = this.vkus;
    }

    public String toString() {
        return "JellyBelly: [" + super.toString() + " Вкус: " + this.vkus + "]";
    }
}
