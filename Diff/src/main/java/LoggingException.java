import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

class LoggingExceptions extends Exception {
    private static Logger logger = Logger.getLogger("Logging Exception");

    public LoggingExceptions() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

public class LoggingException {
    public static void main(String[] args) {
        try {
            throw new LoggingExceptions();
        } catch (LoggingExceptions e) {
            System.err.println("Перехвачено" + " " + e);
        }
        try {
            throw new LoggingExceptions();
        } catch (LoggingExceptions e) {
            System.err.println("Перехвачено" + " " + e);
        }
    }
}

