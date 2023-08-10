import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomerStorage {
    private static final Marker INVALID_ERROR = MarkerManager.getMarker("INVALID_ERROR");
    private final Map<String, Customer> storage;

    public CustomerStorage() {
        storage = new HashMap<>();
    }

    public void addCustomer(String data) {
        final int INDEX_NAME = 0;
        final int INDEX_SURNAME = 1;
        final int INDEX_EMAIL = 2;
        final int INDEX_PHONE = 3;

        String[] components = data.split("\\s+");
        if (components.length !=4){
            Main.logger.info(INVALID_ERROR, "неверный формат данных");
            throw new IllegalArgumentException(" неправлиный формат данных");
        }
         if (components[INDEX_PHONE].length() != 12) {
             Main.logger.info(INVALID_ERROR,"неверный формат телефона");
            throw new IllegalArgumentException("неправлиный формат телефона");
        }
        Pattern patternEmail = Pattern.compile("^(.+)@(\\S+)$");
        Matcher matcherEmail = patternEmail.matcher(components[INDEX_EMAIL]);
        if(!matcherEmail.matches()){
            Main.logger.info(INVALID_ERROR,"неверный формат почты");
            throw new IllegalArgumentException("неправлиный формат почты");
        }
        String name = components[INDEX_NAME] + " " + components[INDEX_SURNAME];
        storage.put(name, new Customer(name, components[INDEX_PHONE], components[INDEX_EMAIL]));
    }

    public void listCustomers() {
        storage.values().forEach(System.out::println);
    }

    public void removeCustomer(String name) {
        storage.remove(name);
    }

    public Customer getCustomer(String name) {
        return storage.get(name);
    }

    public int getCount() {
        return storage.size();
    }
}