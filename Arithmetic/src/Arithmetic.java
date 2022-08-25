public class Arithmetic {
    private static int number1;
    private static int number2;


    public Arithmetic (int number1, int number2){
        this.number1 = number1;
        this.number2 = number2;
    }


    public static void mnozhitelNumber() {
        int result = number1 * number2;
        System.out.println("umnozhenie chsel rovno: " + result);
    }

    public static void slozhenieNumber() {
        int result = number1 + number2;
        System.out.println("summa chsel rovna: " + result);
    }

    public static void bolshieNumber() {
        if (number1 > number2) {
            System.out.println("bolshie chslo " + number1);
        } else {
            System.out.println("bolshie chslo " + number2);
        }

    }

    public static void menshieNumber() {
        if (number1 > number2) {
            System.out.println("menshie chslo " + number2);
        } else {
            System.out.println("menshie chslo " + number1);
        }


    }
}
