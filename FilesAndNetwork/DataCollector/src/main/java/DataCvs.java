import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DataCvs {
    private String name;
    private String data;

    public DataCvs(String fragment, String fragment1) {
        this.name = fragment;
        this.data = fragment1;
    }

    public DataCvs() {

    }


    public void parsingDataCvs(){
    ArrayList<DataCvs> dataCvsArrayList = new ArrayList<>();
    try {
        List<String> lines = Files.readAllLines(Paths.get("src\\data\\data\\9\\6\\dates-3.csv"));
        for (String line : lines){
            String[] fragments = line.split(";");
            if(fragments.length !=2){
                System.out.println("Wront line: " + line);
                continue;
            }
            dataCvsArrayList.add(new DataCvs(fragments[0], fragments[1]));
            System.out.println(dataCvsArrayList.size());
        }



    }catch (Exception e){
        e.printStackTrace();
    }
}
}
