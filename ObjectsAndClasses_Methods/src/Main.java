public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 1,1, 300);
        basket.add("kolbasa", 1, 1, 500);
        basket.add("copceiks",1,1);
        basket.add("salo", 1, 1);

        System.out.println(basket.items);

        System.out.println("Total weight: " + basket.getTotalWeight() + " gr.");
        System.out.println(basket.getTotalPrice() + "ru");

    }
}
