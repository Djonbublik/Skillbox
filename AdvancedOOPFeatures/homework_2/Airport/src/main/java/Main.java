import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Flight> list = findPlanesLeavingInTheNextTwoHours(Airport.getInstance());
        list.forEach(System.out::println);


    }

    public static List<Flight> findPlanesLeavingInTheNextTwoHours(Airport airport) {
            //TODO Метод должден вернуть список рейсов вылетающих в ближайшие два часа.
            List<Flight> list = new ArrayList<>();
            Calendar calendar = Calendar.getInstance();
            calendar.add(Calendar.HOUR_OF_DAY, 2);

            airport.getTerminals().forEach(terminal -> terminal.getFlights().forEach(flight -> {
                if (flight.getDate().after(Calendar.getInstance().getTime())
                        && flight.getDate().before(calendar.getTime())
                        && flight.getType() == Flight.Type.DEPARTURE)
                {
                    list.add(flight);
                }
            }));
            return list;
        }

    }