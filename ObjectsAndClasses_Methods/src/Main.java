public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40,0);
        basket.add("kolbasa", 210, 500);
        System.out.println("Total weight: " + basket.getTotalWeight());
        basket.print("Milk");
    }
}
