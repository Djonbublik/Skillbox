public class Processor {
    public final int processorFrequency;
    public final int processorNumberOfCores;
    public final String processorManufacturer;
    public final int processorWeight;

    public Processor(int processorFrequency, int processorNumberOfCores, String processorManufacturer, int processorWeight) {
        this.processorFrequency = processorFrequency;
        this.processorNumberOfCores = processorNumberOfCores;
        this.processorManufacturer = processorManufacturer;
        this.processorWeight = processorWeight;
    }

    public String toString(){
        return "Haracteristiki processora: " + "\n"
                + "Chastota processora: " + processorFrequency + " grc." + "\n"
                + "Kollichestvo iader: " + processorNumberOfCores + "\n"
                + "Proizvoditel - " + processorManufacturer + "\n"
                + "Ves processora: " + processorWeight + " gr." + "\n";
    }

}
