package loggingframework;

import loggingframework.appender.ConsoleAppender;

public class Logger {

    private LoggerConfig loggerConfig;
    private static Logger instance = null;

    private Logger() {
        // private constructor for singleton pattern
        loggerConfig = new LoggerConfig(
                LogLevel.INFO, new ConsoleAppender()
        );
    }

    // thread safe instance creation
    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
            instance = new Logger();
        }
        return instance;
    }

    public void setLoggerConfig(LoggerConfig loggerConfig) {
        this.loggerConfig = loggerConfig;
    }

    public void log(LogLevel logLevel, String message) {
        LogMessage logMessage = new LogMessage(
                logLevel,
                message
        );
        loggerConfig.getLogAppender().append(logMessage);
    }

    public void debug(String message) {
        log(LogLevel.DEBUG, message);
    }

    public void info(String message) {
        log(LogLevel.INFO, message);
    }

    public void warn(String message) {
        log(LogLevel.WARNING, message);
    }

    public void error(String message) {
        log(LogLevel.ERROR, message);
    }

    public void fatal(String message) {
        log(LogLevel.FATAL, message);
    }
}
