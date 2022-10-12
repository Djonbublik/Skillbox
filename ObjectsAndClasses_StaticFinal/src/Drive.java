public class Drive {
    public final TypeDrive typeDrive;
    public final int driveVolume;
    public final int driveWeight;

    public Drive(TypeDrive typeDrive, int driveVolume, int driveWeight) {
        this.typeDrive = typeDrive;
        this.driveVolume = driveVolume;
        this.driveWeight = driveWeight;
    }
    public  Drive setDriveVolume(int volume){
        return new Drive(typeDrive,
                volume,
                driveWeight);
    }

    public String toString (){
        return "Haracteristiki disca:" + "\n"
                + " Tip disca: " + typeDrive +"." + "\n"
                + " Obiem disca: " + driveVolume + " gb " + "\n"
                + "ves disca: " + driveWeight + " gr." + "\n";
    }
}
