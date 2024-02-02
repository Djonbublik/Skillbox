
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.Getter;
import lombok.Setter;


import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;


@Setter
@Getter
public class Depths  {
    private String station_name;
    private String depth;

    public List<Depths> depthParse(){
        List<Depths> depthsList = null;
        try {
            String json = Files.readString(Paths.get("src\\data\\data\\7\\1\\depths-2.json"));
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.registerModule(new JavaTimeModule());
            Depths[] depths = objectMapper.readValue(json, Depths[].class);
             depthsList = Arrays.stream(depths).toList();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return depthsList;
    }


    @Override
    public String toString() {
        return "Depths{" +
                "station_name='" + station_name + '\'' +
                ", depth='" + depth + '\'' +
                '}';
    }



}







