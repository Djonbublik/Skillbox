public class Screen {
    private final String screendiagonal;
    private final ScreenType screenType;
    private final int screenWeight;

    public Screen(String screendiagonal, ScreenType screenType, int screenWeight) {
        this.screendiagonal = screendiagonal;
        this.screenType = screenType;
        this.screenWeight = screenWeight;
    }

    public String toString() {
        return
                "Haracteristica monitora" + "\n"
                        + "Diagonal: " + screendiagonal + "\n"
                        + "Tip monitora: " + screenType + "\n"
                        + "Ves monitora: " + screenWeight + " gr." + "\n";
    }

    public int getScreenWeight() {
        return screenWeight;
    }

    public Screen setScreendiagonal(String screendiagonal) {
        return new Screen(screendiagonal,
                screenType,
                screenWeight);
    }

    public Screen setScreenType(ScreenType screenType) {
        return new Screen(screendiagonal,
                screenType,
                screenWeight);
    }

    public Screen setScreenWeight(int screenWeight) {
        return new Screen(screendiagonal,
                screenType,
                screenWeight);
    }
}
