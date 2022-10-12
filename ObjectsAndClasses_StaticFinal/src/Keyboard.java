public class Keyboard {
    public final TypeKeyboard typeKeyboard;
    public final KeyboardRGB ketboardRgb;
    public final int ketboardWeight;

    public Keyboard(TypeKeyboard typeKeyboard, KeyboardRGB ketboardRgb, int ketboardWeight) {
        this.typeKeyboard = typeKeyboard;
        this.ketboardRgb = ketboardRgb;
        this.ketboardWeight = ketboardWeight;
    }
    public  String toString (){
        return "Harakteristiki klavi: " + "\n"
                + "Tip klavi: " + typeKeyboard + "\n"
                + "Podsvetka: " + ketboardRgb + "\n"
                + "Ves klavi: " + ketboardWeight + " gr." + "\n";
    }
}
