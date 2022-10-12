public class RAM {
    public final TypeRAM typeRAM;
    public final int ramVolume;
    public final int ramWeight;

    public RAM(TypeRAM typeRAM, int ramVolume, int ramWeight) {
        this.typeRAM = typeRAM;
        this.ramVolume = ramVolume;
        this.ramWeight = ramWeight;
    }
    public String toString(){
        return "Harakteristiki RAM: " + "\n"
                + "Tip RAM: " + typeRAM + "\n"
                + "Obiem RAM: " + ramVolume + " gb." +  "\n"
                + "Ves RAM: " + ramWeight + " gr.";
    }
}
