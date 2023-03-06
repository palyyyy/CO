package timing;

public class Timer implements ITimer {
    private long totalTime = 0;
    private long start;

    @Override
    public void start() {
        start = System.nanoTime();
    }

    @Override
    public long stop() {
        if (totalTime == 0) {
            return System.nanoTime() - start;
        }
        totalTime += System.nanoTime() - start;
        return totalTime;
    }

    @Override
    public void resume() {
        start = System.nanoTime();
    }

    @Override
    public long pause() {
        long end = System.nanoTime();
        long elapsedTime = end - start;

        totalTime += elapsedTime;

        return elapsedTime;
    }
}