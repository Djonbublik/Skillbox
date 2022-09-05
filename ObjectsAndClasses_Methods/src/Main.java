public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40,1, 500);
        basket.add("kolbasa", 210, 1);
        basket.add("kol", 20,2,300);

        System.out.println(basket.items);

        System.out.println("Total weight: " + basket.getTotalWeight() + " gr.");

        Arithmetic arithmetic = new Arithmetic();
        arithmetic.mnozhitelNumber();
        arithmetic.print();
    }
}
