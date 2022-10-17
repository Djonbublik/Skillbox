public class Keyboard {
    private final TypeKeyboard typeKeyboard;
    private final KeyboardRGB ketboardRgb;
    private final int ketboardWeight;

    public Keyboard(TypeKeyboard typeKeyboard, KeyboardRGB ketboardRgb, int ketboardWeight) {
        this.typeKeyboard = typeKeyboard;
        this.ketboardRgb = ketboardRgb;
        this.ketboardWeight = ketboardWeight;
    }

    public String toString() {
        return "Harakteristiki klavi: " + "\n"
                + "Tip klavi: " + typeKeyboard + "\n"
                + "Podsvetka: " + ketboardRgb + "\n"
                + "Ves klavi: " + ketboardWeight + " gr." + "\n";
    }

    public int getKetboardWeight() {
        return ketboardWeight;
    }

    public Keyboard setTypeKeyboard(TypeKeyboard typeKeyboard) {
        return new Keyboard(typeKeyboard, ketboardRgb, ketboardWeight);
    }

    public Keyboard setKetboardRgb(KeyboardRGB ketboardRgb) {
        return new Keyboard(typeKeyboard, ketboardRgb, ketboardWeight);
    }

    public Keyboard setKetboardWeight(int ketboardWeight) {
        return new Keyboard(typeKeyboard, ketboardRgb, ketboardWeight);
    }
}
