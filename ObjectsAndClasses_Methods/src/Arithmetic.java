public class Arithmetic {
        private int number1 = 2;
        private int number2 = 6;

        private int result;


        public Arithmetic (){
            this.number1 = number1;
            this.number2 = number2;
            this.result = result;
        }


        public  void mnozhitelNumber() {
            result = number1 * number2;
        }

        public  void slozhenieNumber() {
             result = number1 + number2;
        }

        public  void bolshieNumber() {
            if (number1 > number2) {
                result = number1;
            } else {
                result = number2;
            }

        }

        public  void menshieNumber() {
            if (number1 > number2) {
                result = number2;
            } else {
                result = number1;
            }


        }
        public void print() {
            System.out.println(result);

        }
    }

