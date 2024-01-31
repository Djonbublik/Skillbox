public class Station {
    String lineNumber;
    String statuoinName;

    public Station(String lineNumber, String statuoinName) {
        this.statuoinName = statuoinName;
        this.lineNumber = lineNumber;
    }

    @Override
    public String toString() {
        return "Номер линии " + lineNumber + " : " + statuoinName;
    }
}
