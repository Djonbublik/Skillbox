public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 44,1, 300);
        basket.add("kolbasa", 66, 2, 500);
        basket.add("copceiks",33,1);
        basket.add("salo", 22, 2);

        System.out.println(basket.items);

        System.out.println("Total weight: " + basket.getTotalWeight() + " gr.");
        System.out.println(basket.getTotalPrice() + "ru");

        Basket basket1 = new Basket();
        basket1.add("Milk", 56,1, 300);
        basket1.add("kolbasa", 350, 1, 500);
        basket1.add("copceiks",120,3);
        basket1.add("salo", 400, 1);


        Basket basket2 = new Basket();
        basket2.add("Milk", 500,1, 300);
        basket2.add("kolbasa", 600, 1, 500);
        basket2.add("copceiks",100,3);
        basket2.add("salo", 1000, 2);



        System.out.println(Basket.averagePriceBaskets() + " srednii stoimosti basket");
        System.out.println(Basket.getAveragePrice()+ " srednii stoimosti prodykta");






    }
}
