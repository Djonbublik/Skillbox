public class Main {
    public static void main(String[] args) {
//        Elevator elevator = new Elevator(-3, 26);
//        while (true) {
//            System.out.print("Vvedite nomer atozha ");
//            int floor = new Scanner(System.in).nextInt();
//            elevator.move(floor);

        Dimensions dimensions = new Dimensions(4, 5, 6);


        MainDimensions mainDimensions = new MainDimensions(dimensions, "45 grid",
                45, "43434", true, true);
        mainDimensions.printMainDimensions();
        dimensions.getDimensions();
        System.out.println(dimensions.getDimensions());

        dimensions = dimensions.setHeight(9);
        dimensions.getDimensions();
        System.out.println(dimensions.getDimensions());





    }

}


