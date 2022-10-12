public class Elevator {
     private  int currentFloor = 1;
     private final int minFloor;
     private final int maxFloor;

     private int staticCurrntFloor = currentFloor;


    public Elevator(int minFloor, int maxFloor){
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }
    public int getCurrentFloor () {
        return currentFloor;
    }

    public void moveDown() {
        currentFloor = currentFloor > minFloor ? currentFloor - 1 : currentFloor;
        System.out.println(currentFloor);
    }

    public void moveUp() {
        currentFloor = currentFloor < maxFloor ? currentFloor + 1 : currentFloor;
        System.out.println(currentFloor);
    }
    public void move(int floor) {
        if ( currentFloor < floor) {
            for (staticCurrntFloor = getCurrentFloor(); staticCurrntFloor < floor; staticCurrntFloor = staticCurrntFloor + 1) {
                moveUp();

            }
        }
        if ( currentFloor > floor) {
            for (staticCurrntFloor = 1; getCurrentFloor() > floor; staticCurrntFloor = staticCurrntFloor - 1) {
                moveDown();

            }
        }
        if (floor < minFloor || floor > maxFloor){
            System.out.println("zadan ne korectnii atazh");
        }
    }
}
