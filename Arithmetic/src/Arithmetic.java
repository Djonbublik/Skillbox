package src;

public class Arithmetic {
    private static int number1;
    private static int number2;
    private static int result;


    public Arithmetic (int number1, int number2){
        this.number1 = number1;
        this.number2 = number2;
    }


    public static void mnozhitelNumber() {
        result = number1 * number2;
        return;
    }

    public static void slozhenieNumber() {
        result = number1 + number2;
        return;
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
