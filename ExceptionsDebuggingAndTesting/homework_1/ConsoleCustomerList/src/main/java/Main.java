import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

import java.util.Scanner;


public class Main {

    public static Logger logger;
    private static final Marker INPUT_HISTORY_MARKER = MarkerManager.getMarker("INPUT_HISTORY");

    private static final String ADD_COMMAND = "add Василий Петров " +
            "vasily.petrov@gmail.com +79215637722";
    private static final String COMMAND_EXAMPLES = "\t" + ADD_COMMAND + "\n" +
            "\tlist\n\tcount\n\tremove Василий Петров";
    private static final String COMMAND_ERROR = "Wrong command! Available command examples: \n" +
            COMMAND_EXAMPLES;
    private static final String helpText = "Command examples:\n" + COMMAND_EXAMPLES;

    public static void main(String[] args) {
         logger = LogManager.getLogger(Main.class);


        Scanner scanner = new Scanner(System.in);
        CustomerStorage executor = new CustomerStorage();
        for (;;) {
            try {

                String command = scanner.nextLine();
                String[] tokens = command.split("\\s+", 2);

                if (tokens[0].equals("add")) {
                    executor.addCustomer(tokens[1]);
                    logger.info(INPUT_HISTORY_MARKER,  command + " пользователь добавил данные о клиенте");
                } else if (tokens[0].equals("list")) {
                    executor.listCustomers();
                    logger.info(INPUT_HISTORY_MARKER, command + " пользователь запросил данные о клиенте");
                } else if (tokens[0].equals("remove")) {
                    executor.removeCustomer(tokens[1]);
                    logger.info(INPUT_HISTORY_MARKER, command + " пользователь удалил данные о клиенте");
                } else if (tokens[0].equals("count")) {
                    System.out.println("There are " + executor.getCount() + " customers");
                } else if (tokens[0].equals("help")) {
                    System.out.println(helpText);
                    logger.info(INPUT_HISTORY_MARKER, command + " пользователь запросил список команд");
                } else {
                    System.out.println(COMMAND_ERROR);
                }
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }
        }
    }

