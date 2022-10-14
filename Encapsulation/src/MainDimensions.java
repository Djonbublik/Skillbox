public class MainDimensions {
    private final String deliveryAddress;
    private final int weight;
    private final String registrationNumber;
    private final boolean toFlip;
    private final boolean fragile;

    private final  Dimensions dimensions;


    public MainDimensions(Dimensions dimensions,
                          String deliveryAddress,
                          int weight,
                          String registrationNumber,
                          boolean toFlip,
                          boolean fragile) {


        this.deliveryAddress = deliveryAddress;
        this.weight = weight;
        this.registrationNumber = registrationNumber;
        this.toFlip = toFlip;
        this.fragile = fragile;
        this.dimensions = dimensions;



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

    public int getWeight() {
        return weight;
    }



    public void printMainDimensions() {
        System.out.println(dimensions);
    }


    public MainDimensions setDeliveryAddress(String deliveryAddress) {

        return new MainDimensions(dimensions,
                deliveryAddress,
                weight,
                registrationNumber,
                toFlip,
                fragile);
    }

    public MainDimensions setRegistrationNumber(String registrationNumber) {

        return new MainDimensions(dimensions,
                deliveryAddress,
                weight,
                registrationNumber,
                toFlip,
                fragile);
    }

    public MainDimensions setWeight(int weight) {

        return new MainDimensions(dimensions,
                deliveryAddress,
                weight,
                registrationNumber,
                toFlip,
                fragile);
    }

    public MainDimensions setToFlip(boolean toFlip) {

        return new MainDimensions(dimensions,
                deliveryAddress,
                weight,
                registrationNumber,
                toFlip,
                fragile);
    }

    public MainDimensions setFragile(boolean fragile) {

        return new MainDimensions(dimensions,
                deliveryAddress,
                weight,
                registrationNumber,
                toFlip,
                fragile);
    }

    public String toString() {
        return dimensions + "\n";
    }

}
