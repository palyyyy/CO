package logging;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileLogger implements ILogger {
    private PrintWriter logFile;

    public FileLogger(String logFilePath) {
        try {
            this.logFile = new PrintWriter(new FileWriter(logFilePath));
        } catch (IOException e) {
            System.out.println("Error opening the file.");
            e.printStackTrace();
        }
    }

    @Override
    public void write(long value) {
        logFile.println(value);
    }

    @Override
    public void write(String value) {
        logFile.println(value);
    }

    @Override
    public void write(Object... values) {
        for (Object value : values) {
            logFile.println(value + " ");
        }
    }

    @Override
    public void close() {
        logFile.close();
    }
}
