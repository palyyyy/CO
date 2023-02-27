package bench;

public interface IBenchmark {

    void run();

    void run(Object);

    void initialize(Object);

    void clean();

    void cancel();

}
