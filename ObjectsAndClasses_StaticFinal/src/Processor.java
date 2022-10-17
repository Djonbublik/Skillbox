public class Processor {
    private final int processorFrequency;
    private final int processorNumberOfCores;
    private final String processorManufacturer;
    private final int processorWeight;

    public Processor(int processorFrequency, int processorNumberOfCores, String processorManufacturer, int processorWeight) {
        this.processorFrequency = processorFrequency;
        this.processorNumberOfCores = processorNumberOfCores;
        this.processorManufacturer = processorManufacturer;
        this.processorWeight = processorWeight;
    }

    public String toString() {
        return "Haracteristiki processora: " + "\n"
                + "Chastota processora: " + processorFrequency + " grc." + "\n"
                + "Kollichestvo iader: " + processorNumberOfCores + "\n"
                + "Proizvoditel - " + processorManufacturer + "\n"
                + "Ves processora: " + processorWeight + " gr." + "\n";
    }

    public Processor setProcessorWeight(int processorWeight) {
        return new Processor(processorFrequency, processorNumberOfCores, processorManufacturer, processorWeight);
    }

    public Processor setProcessorFrequency(int processorFrequency) {
        return new Processor(processorFrequency, processorNumberOfCores, processorManufacturer, processorWeight);
    }

    public Processor setProcessorNumberOfCores(int processorNumberOfCores) {
        return new Processor(processorFrequency, processorNumberOfCores, processorManufacturer, processorWeight);
    }

    public Processor setProcessorManufacturer(String processorManufacturer) {
        return new Processor(processorFrequency, processorNumberOfCores, processorManufacturer, processorWeight);
    }

    public int getProcessorWeight() {
        return processorWeight;
    }

}
