package SweetGift;

public class Box {

    public Box() {
    }

    public void all() {
        double weight = 0.0D;
        double price = 0.0D;
        Candy candy1 = new Candy("M&M", 210.0D, 0.3D, "Chocolate");
        JellyBelly jellyBelly1 = new JellyBelly("Ассорти Jelly Belly", 750.0D, 0.9D, "fruit");
        Chocolate chocolate1 = new Chocolate("Milka", 79.0D, 0.2D, "dark");
        Gift[] box = new Gift[]{candy1, jellyBelly1, chocolate1};
        weight += candy1.getWeight() + jellyBelly1.getWeight() + chocolate1.getWeight();
        price += candy1.getPrice() + jellyBelly1.getPrice() + chocolate1.getPrice();
        System.out.println("Вес: " + weight);
        System.out.println("Цена: " + price);
        Gift[] var9 = box;
        int var10 = box.length;

        for(int var11 = 0; var11 < var10; ++var11) {
            Gift someGift = var9[var11];
            System.out.println("Состав: " + someGift.toString());
        }

    }
}
