public class Lines {
    String titleNumberLine;
    String lineName;

    public Lines(String titleNumberLine, String lineName) {
        this.titleNumberLine = titleNumberLine;
        this.lineName = lineName;
    }

    @Override
    public String toString() {
        return titleNumberLine + '\'' + lineName;
    }
}
