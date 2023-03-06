package timing;

public interface ITimer {
    public long totalTime = 0;
    public long start = 0;

    void start();

    long stop();

    void resume();

    long pause();
}
