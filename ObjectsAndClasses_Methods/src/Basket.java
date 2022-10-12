public class Basket {
    private static int count = 0;
    public String items = "";
    private  int totalPrice = 0;
    private  int limit;
    private  double totalWeight = 0;

    public  static int totalBasketCount;

    public  static  int totalBasketsPrice;

    public static int averagePrice;
    public static int averagePriceBaskets;

    public static int getAveragePrice (){
        return averagePrice();
    }
    public static int getAveragePriceBaskets(){
        return averagePriceBaskets();
    }
    public static int getTotalBasketCount(){
        return totalBasketCount;
    }
    public static int getTotalBasketsPrice(){
        return totalBasketsPrice;
    }


    public Basket() {
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    public static int getCount() {

        return count;
    }

    public  void increaseCount(int count) {

        Basket.count = Basket.count + count;
        System.out.println(Basket.count);

    }

    public static void increaseTotalCoun(int count){
        Basket.totalBasketCount = Basket.totalBasketCount + count;

    }

    public static void increaseTotalPrice(int price){
        Basket.totalBasketsPrice = Basket.totalBasketsPrice + price;

    }

    public static int averagePrice() {
        return  averagePrice = Basket.totalBasketsPrice/Basket.totalBasketCount;
    }

    public static int averagePriceBaskets(){

        return averagePriceBaskets = Basket.totalBasketsPrice/Basket.count;
    }




    public  void add(String name, int price, int count) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " + count + " шт. - " + price + "rub";
        totalPrice = totalPrice + count * price;
        increaseTotalCoun(count);
        increaseTotalPrice(price);
    }
    public void add(String name, int price, int count, double weight) {
        add(name , price , count);
        items = items + " " + weight + " gr.";
        totalWeight = totalWeight + weight * count;
    }




    public void clear() {
        items = "";
        totalPrice = 0;
        totalWeight = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public  boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }

}
