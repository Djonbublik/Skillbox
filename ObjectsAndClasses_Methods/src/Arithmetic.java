public class Arithmetic {
        private int number1 = 2;
        private int number2 = 6;


        public Arithmetic (){
            this.number1 = number1;
            this.number2 = number2;

        }


        public int mnozhitelNumber() {
            int result = number1 * number2;
            return result;
        }

        public int slozhenieNumber() {
            int result = number1 + number2;
            return result;
        }

        public  int bolshieNumber() {
            if (number1 > number2) {
               int result = number1;
               return result;
            } else {
               int result = number2;
               return result;
            }

        }

        public int menshieNumber() {
            if (number1 > number2) {
               int result = number2;
               return result;
            } else {
               int result = number1;
               return result;
            }

        }
    }

