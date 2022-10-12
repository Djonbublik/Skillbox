public class Screen {
    public final String  screendiagonal;
    public final ScreenType screenType;
    public final int screenWeight;

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
}
