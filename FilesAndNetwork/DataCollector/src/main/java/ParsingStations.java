import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;

import java.util.ArrayList;

public class ParsingStations {
    ArrayList<Station> stations = new ArrayList<>();
    public ArrayList<Station> parsingStations(){
        try {
            var document = Jsoup.connect("https://skillbox-java.github.io/").get();
            var titleStations = document.select("div.js-metro-stations");
            var linesNames = document.select("span.js-metro-line");


            for(Element element : titleStations){
                String lineNumber = element.attr("data-line");
                String stationName = element.text();
                stations.add(new Station(lineNumber, stationName));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        stations.forEach(System.out::println);
        return stations;
    }

}
