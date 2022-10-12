public class Main {
    public static void main(String[] args) {

        Processor processor = new Processor(3,8,"IntelCore",300);
        Drive drive = new Drive(TypeDrive.SSD,1000,400);
        Screen screen = new Screen("1280x1024",ScreenType.IPS, 2000);
        RAM ram = new RAM(TypeRAM.DDR_4, 8, 150);
        Keyboard keyboard = new Keyboard(TypeKeyboard.mechanical,KeyboardRGB.DA,500);


        Computer computer = new Computer("Msi Predator","MSI",processor,ram, drive, screen,keyboard);
        computer.setDrive(new Drive(TypeDrive.SSD,500,400));

        Processor processor1 = new Processor(4,6,"AMD",400);
        Drive drive1 = new Drive(TypeDrive.HDD,2000,600);
        Screen screen1 = new Screen("1920x1650",ScreenType.VA,2500);
        RAM ram1 = new RAM(TypeRAM.DDR_5,16,800);
        Keyboard keyboard1 = new Keyboard(TypeKeyboard.membrane,KeyboardRGB.NET,500);

        Computer computer1 = new Computer("Samsung A-234", "Samsung", processor1,ram1,drive1,screen1,keyboard1);


        System.out.println(computer.toString());
        System.out.println(computer1.toString());




    }


}
