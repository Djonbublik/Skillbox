public class Drive {
    private final TypeDrive typeDrive;
    private final int driveVolume;
    private final int driveWeight;

    public Drive(TypeDrive typeDrive, int driveVolume, int driveWeight) {
        this.typeDrive = typeDrive;
        this.driveVolume = driveVolume;
        this.driveWeight = driveWeight;
    }

    public String toString() {
        return "Haracteristiki disca:" + "\n"
                + " Tip disca: " + typeDrive + "." + "\n"
                + " Obiem disca: " + driveVolume + " gb " + "\n"
                + "ves disca: " + driveWeight + " gr." + "\n";
    }

    public int getDriveWeight() {
        return driveWeight;
    }

    public Drive setTypeDrive(TypeDrive typeDrive) {
        return new Drive(typeDrive, driveVolume, driveWeight);
    }

    public Drive setDriveVolume(int driveVolume) {
        return new Drive(typeDrive, driveVolume, driveWeight);
    }

    public Drive setDriveWeight(int driveWeight) {
        return new Drive(typeDrive, driveVolume, driveWeight);
    }
}
