import entity.Metro;

public class Main {
    public static void main(String[] args) throws Exception {
            System.out.println("Program for parsing files");

            Metro mskMetro = new Metro();

            FinderFilesInFolders finderFiles = new FinderFilesInFolders(mskMetro);
            finderFiles.browsingFolder("data/data");
            mskMetro.writeMapToJson();
            mskMetro.writeStationsToJson();
        }
    }