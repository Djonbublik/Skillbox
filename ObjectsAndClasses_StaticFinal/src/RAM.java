public class RAM {
    private final TypeRAM typeRAM;
    private final int ramVolume;
    private final int ramWeight;

    public RAM(TypeRAM typeRAM, int ramVolume, int ramWeight) {
        this.typeRAM = typeRAM;
        this.ramVolume = ramVolume;
        this.ramWeight = ramWeight;
    }

    public String toString() {
        return "Harakteristiki RAM: " + "\n"
                + "Tip RAM: " + typeRAM + "\n"
                + "Obiem RAM: " + ramVolume + " gb." + "\n"
                + "Ves RAM: " + ramWeight + " gr.";
    }

    public RAM setTypeRAM(TypeRAM typeRAM) {
        return new RAM(typeRAM,
                ramVolume,
                ramWeight);
    }

    public RAM setRamVolume(int ramVolume) {
        return new RAM(typeRAM,
                ramVolume,
                ramWeight);
    }

    public RAM setRamWeight(int ramWeight) {
        return new RAM(typeRAM,
                ramVolume,
                ramWeight);
    }

    public int getRamWeight() {
        return ramWeight;
    }

}
