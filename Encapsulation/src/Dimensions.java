public class Dimensions {
    public final String weight;
    public final int deliveryAddress;
    public final String registrationNumber;
    public final boolean toFlip;
    public final boolean fragile;
    private final int height;
    private final int width;
    private  final int length;
    static int dimensions = 0;



    public  Dimensions(int height,
                       int width,
                       int length,
                       String weight,
                       int deliveryAddress,
                       String registrationNumber,
                       boolean toFlip,
                       boolean fragile){
        this.height = height;
        this.width = width;
        this.length = length;
        this.weight = weight;
        this.toFlip = toFlip;
        this.fragile = fragile;
        this.registrationNumber = registrationNumber;
        this.deliveryAddress = deliveryAddress;
        dimensions = height * width * length;
    }
    public static int getDimensionsz(){
        return dimensions;
    }

    public Dimensions setHeight(int height){
        return new Dimensions(height,
        width,
        length,
        weight,
        deliveryAddress,
        registrationNumber,
        toFlip,
        fragile);
    }



    public static void print(){
        System.out.println(" obshii obiem posilki " + dimensions + " sm.");
    }



}










