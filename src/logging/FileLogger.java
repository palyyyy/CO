package logging;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileLogger implements ILogger {
    private PrintWriter WriteFile;

    public FileLogger(String logFilePath) {
        try {
            this.WriteFile = new PrintWriter(new FileWriter(logFilePath));
        } catch (IOException e) {
            System.out.println("Error opening the file.");
            e.printStackTrace();
        }
    }

    @Override
    public void write(long value) {
        WriteFile.println(value);
    }

    @Override
    public void write(String value) {
        WriteFile.println(value);
    }

    @Override
    public void write(Object... values) {
        for (Object value : values) {
            WriteFile.println(value + " ");
        }
    }

    @Override
    public void close() {
        WriteFile.close();
    }
}
