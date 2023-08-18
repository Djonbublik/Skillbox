import core.Line;
import core.Station;
import junit.framework.TestCase;

import java.util.*;

public class RouteCalculatorTest extends TestCase {
    RouteCalculator routeCalculator;
    StationIndex stationIndex = new StationIndex();
    List<Station> rout;
    HashMap <String, Station> metroMap;
    @Override
    protected void setUp() throws Exception {
        rout = new ArrayList<>();


       metroMap = new HashMap<>();
        Line line1 = new Line(1, "1л");
        Line line2 = new Line(2, "2л");
        Line line3 = new Line(3, "3л");
        Line line4 = new Line(4, "4л");

        metroMap.put("1с.1л", new Station("1с. 1л.", line1));
        metroMap.put("2с.1л", new Station("2с. 1л.", line1));
        metroMap.put("3с.1л", new Station("3с. 1л.", line1));
        metroMap.put("4с.1л", new Station("4с. 1л.", line1));

        metroMap.put("1с.2л", new Station("1с. 2л.", line2));
        metroMap.put("2с.2л", new Station("2с. 2л.", line2));
        metroMap.put("3с.2л", new Station("3с. 2л.", line2));
        metroMap.put("4с.2л", new Station("4с. 2л.", line2));

        metroMap.put("1с.3л", new Station("1с. 3л.", line3));
        metroMap.put("2с.3л", new Station("2с. 3л.", line3));
        metroMap.put("3с.3л", new Station("3с. 3л.", line3));
        metroMap.put("4с.3л", new Station("4с. 3л.", line3));

        metroMap.put("1с.4л", new Station("1с. 4л.", line4));
        metroMap.put("2с.4л", new Station("2с. 4л.", line4));
        metroMap.put("3с.4л", new Station("3с. 4л.", line4));
        metroMap.put("4с.4л", new Station("4с. 4л.", line4));






        metroMap.forEach((key, value) -> {
            stationIndex.addStation(value);
            switch (value.getLine().getNumber()) {
                case 1 -> line1.addStation(value);
                case 2 -> line2.addStation(value);
                case 3 -> line3.addStation(value);
                case 4 -> line4.addStation(value);
            }
        });



        routeCalculator = new RouteCalculator(stationIndex);
        stationIndex.addLine(line1);
        stationIndex.addLine(line2);
        stationIndex.addLine(line3);
        stationIndex.addLine(line4);
        stationIndex.addConnection(new ArrayList<>(Arrays.asList(metroMap.get("2с.1л"), metroMap.get("2с.2л"))));
        stationIndex.addConnection(new ArrayList<>(Arrays.asList(metroMap.get("3с.2л"), metroMap.get("2с.4л"))));
        stationIndex.addConnection(new ArrayList<>(Arrays.asList(metroMap.get("2с.3л"), metroMap.get("3с.1л"))));
        stationIndex.addConnection(new ArrayList<>(Arrays.asList(metroMap.get("3с.3л"), metroMap.get("3с.4л"))));



    }

    public void testRouteCalculator(){
        this.stationIndex = stationIndex;
        final Map<Integer, Line> number2line;
        final TreeSet<Station> stations;
        final Map<Station, TreeSet<Station>> connections;
        number2line = new HashMap<>();
        stations = new TreeSet<>();
        connections = new TreeMap<>();
        number2line.put(1 , new Line(1, "1л"));
        stations.add(new Station("1с. 1л.", number2line.get(1)));
        System.out.println();


        assertEquals(stationIndex, stationIndex);
    }


    public void testCalculateDuration(){
        Line line1 = new Line(1, "1л");
        Line line2 = new Line(2, "2л");
        rout.add(new Station("Петровская", line1));
        rout.add(new Station("Арбузная", line1));
        rout.add(new Station("Марковная", line2));
        rout.add(new Station("Яблочная", line2));
        double actual = RouteCalculator.calculateDuration(rout);
        double expected = 8.5;
        assertEquals(expected, actual);
    }

    public void  testGetShortestRoute(){
        rout = new ArrayList<>();
        rout.add(metroMap.get("1с.2л"));
        rout.add(metroMap.get("4с.2л"));

        assertEquals((RouteCalculator.getShortestRoute(metroMap.get("1с.2л"), metroMap.get("4с.2л"))), rout);

    }
    public void testGetRouteOnTheLine() {

        rout = new ArrayList<>();
        rout.add(metroMap.get("1с.2л"));
        rout.add(metroMap.get("4с.2л"));
        rout.add(metroMap.get("3с.2л"));
        assertEquals(routeCalculator.getShortestRoute(metroMap.get("1с.2л"), metroMap.get("3с.2л")), rout);
    }
    public void testGetRouteWithOneConnection() {
        rout = new ArrayList<>();
        rout.add(metroMap.get("1с.2л"));
        rout.add(metroMap.get("4с.2л"));
        rout.add(metroMap.get("3с.2л"));
        rout.add(metroMap.get("2с.4л"));
        rout.add(metroMap.get("1с.4л"));
        assertEquals(routeCalculator.getShortestRoute(metroMap.get("1с.2л"), metroMap.get("1с.4л")), rout);
    }

    public void testGetRouteWithTwoConnections() {
        rout = new ArrayList<>();
        rout.add(metroMap.get("1с.1л"));
        rout.add(metroMap.get("3с.1л"));
        rout.add(metroMap.get("2с.3л"));
        rout.add(metroMap.get("3с.3л"));
        rout.add(metroMap.get("3с.4л"));
        assertEquals(routeCalculator.getRouteWithTwoConnections(metroMap.get("1с.1л"), metroMap.get("3с.4л")),rout );


    }

    public void testIsConnected(){

        rout.add(metroMap.get("2с.1л"));
        rout.add(metroMap.get("2с.2л"));
        Set<Station> connected = stationIndex.getConnectedStations(metroMap.get("2с.1л"));
        assertEquals(connected.contains(metroMap.get("2с.2л")), true);
    }

    public void testGetRouteViaConnectedLine(){
        rout.add(metroMap.get("3с.1л"));
        assertEquals(rout, RouteCalculator.getRouteViaConnectedLine(metroMap.get("2с.3л"),metroMap.get("2с.3л")));
    }




    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
