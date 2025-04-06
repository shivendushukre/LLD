import loggingframework.LogLevel;
import loggingframework.Logger;
import loggingframework.LoggerConfig;
import loggingframework.appender.FileAppender;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.info("Logging info..");
        logger.warn("WARNING logged");

        LoggerConfig newLoggerConfig = new LoggerConfig(
                LogLevel.DEBUG, new FileAppender("debug.txt")
        );
        logger.setLoggerConfig(newLoggerConfig);

        logger.debug("Debugging start..");

    }
}