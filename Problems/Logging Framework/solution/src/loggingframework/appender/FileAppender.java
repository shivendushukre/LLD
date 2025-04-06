package loggingframework.appender;

import loggingframework.LogMessage;

import java.io.FileWriter;
import java.io.IOException;

public class FileAppender implements LogAppender{
    private final String filePath;

    public FileAppender(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void append(LogMessage logMessage) {
        try (FileWriter fileWriter = new FileWriter(filePath, true)){
            fileWriter.append(logMessage.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
