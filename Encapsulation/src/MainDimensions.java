public class MainDimensions {
    private final int height;
    private final int width;
    private  final int length;
    private final String deliveryAddress;
    private  final  int weight;
    private final String registrationNumber;
    private final boolean toFlip;
    private final boolean fragile;

    public MainDimensions (int height,
                           int width,
                           int length,
                           String deliveryAddress,
                           int weight,
                           String registrationNumber, boolean toFlip, boolean fragile){
        this.height = height;
        this.width = width;
        this.length = length;

        this.deliveryAddress = deliveryAddress;
        this.weight = weight;
        this.registrationNumber = registrationNumber;
        this.toFlip = toFlip;
        this.fragile = fragile;
    }

    public int getHeight (){
        return height;
    }
    public int getWidth(){
        return width;
    }

    public boolean getIsFragile() {
        return fragile;
    }

    public boolean getIsToFlip() {
        return toFlip;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public int getWeight(){
        return weight;
    }
    public int getLength(){
        return length;
    }

    public MainDimensions setDeliveryAddress (String deliveryAddress){

        return new MainDimensions(height,
                width,
                length,
                deliveryAddress,
                weight,
                registrationNumber,
                toFlip,
                fragile);
    }
    public MainDimensions setRegistrationNumber (String registrationNumber){

        return new MainDimensions(height,
                width,
                length,
                deliveryAddress,
                weight,
                registrationNumber,
                toFlip,
                fragile);
    }
    public MainDimensions setWeight (int weight){

        return new MainDimensions(height,
                width,
                length,
                deliveryAddress,
                weight,
                registrationNumber,
                toFlip,
                fragile);
    }
    public MainDimensions setWidth (int width){

        return new MainDimensions(height,
                width,
                length,
                deliveryAddress,
                weight,
                registrationNumber,
                toFlip,
                fragile);
    }


    public MainDimensions setLength (int length){

        return new MainDimensions(height,
                width,
                length,
                deliveryAddress,
                weight,
                registrationNumber,
                toFlip,
                fragile);
    }

    public MainDimensions setHeight (int height){

        return new MainDimensions(height,
                width,
                length,
                deliveryAddress,
                weight,
                registrationNumber,
                toFlip,
                fragile);
    }
}
