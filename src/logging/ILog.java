package logging;

public interface ILog {
  public void write(long value);

    public void write(String value);

    public void write(Object... values);

    public void close();
}
