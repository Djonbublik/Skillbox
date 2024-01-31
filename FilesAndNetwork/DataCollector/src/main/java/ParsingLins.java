import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;

import java.util.ArrayList;


public class ParsingLins {
    ArrayList<Lines> lines = new ArrayList<>();

    public ArrayList<Lines> parsingLins() {
        try {
            var document = Jsoup.connect("https://skillbox-java.github.io/").get();
            var titleLine = document.select("span.js-metro-line");
            for (Element element : titleLine) {
                String titleNumberLine = element.attr("data-line");
                String lineName = element.text();
                lines.add(new Lines(titleNumberLine, lineName));

            }
            lines.forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();



        }
        return lines;
    }
}




