public class Main {
    public static void main(String[] args) {
//        Elevator elevator = new Elevator(-3, 26);
//        while (true) {
//            System.out.print("Vvedite nomer atozha ");
//            int floor = new Scanner(System.in).nextInt();
//            elevator.move(floor);


        MainDimensions mainDimensions = new MainDimensions(4,4,4,"45 grid",
                45,"gfgfg",true,true);

        Dimensions dimensions = new Dimensions(mainDimensions.getHeight(),
                mainDimensions.getWidth(),
                mainDimensions.getLength(),
                mainDimensions.getDeliveryAddress(),
                mainDimensions.getWeight(),
                mainDimensions.getRegistrationNumber(),
                mainDimensions.getIsToFlip(),
                mainDimensions.getIsFragile());
        dimensions.setHeight(45);
        Dimensions.print();











        }
    }


