import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        DataCvs dataCvs = new DataCvs();
        dataCvs.parsingDataCvs();

        Depths depths = new Depths();
        System.out.println(depths.depthParse());

//        SearchFiles searchFiles = new SearchFiles();
//        ArrayList <File> filesArrayList = new ArrayList<>();
//        searchFiles.searchFile(new File("src/data"), filesArrayList);



        ParsingStations parsingStations = new ParsingStations();
        ParsingLins parsingLins = new ParsingLins();
        parsingStations.parsingStations();
        parsingLins.parsingLins();










    }

}


