package logging;

public class ConsoleLogger implements ILog{
    /**
     * @param value
     */
    @Override
    public void write(long value) {
        System.out.println(value);
    }

    /**
     * @param value
     */
    @Override
    public void write(String value) {
        System.out.println(value);
    }

    /**
     * @param values
     */
    @Override
    public void write(Object... values) {
        for(Object value: values){
            System.out.print(value + " ");
        }
        System.out.println();
    }

    /**
     *
     */
    @Override
    public void close() {

    }

    /**
     * Receives value in nanoseconds, and prints it in desired unit
     * @param value
     * @param unit
     */
    @Override
    public void writeTime(long value, TimeUnit.timeUnit unit) {
        switch(unit){
            case Nano:
                System.out.println("Finished in " + value + " " + unit);
                break;

            case Micro:
                System.out.println("Finished in " + value * Math.pow(10, -3) + " " + unit);
                break;

            case Milli:
                System.out.println("Finished in " + value * Math.pow(10, -6) + " " + unit);
                break;

            case Sec:
                System.out.println("Finished in " + value * Math.pow(10, -9) + " " + unit);
                break;
        }
    }

    /**
     * @param string
     * @param value
     * @param unit
     */
    @Override
    public void writeTime(String string, long value, TimeUnit.timeUnit unit) {
        switch(unit){
            case Nano:
                System.out.println(string + value + " " + unit);
                break;

            case Micro:
                System.out.println(string + value * Math.pow(10, -3) + " " + unit);
                break;

            case Milli:
                System.out.println(string + value * Math.pow(10, -6) + " " + unit);
                break;

            case Sec:
                System.out.println(string + value * Math.pow(10, -9) + " " + unit);
                break;
        }
    }
}

class ConsoleTesting {
    public static void main(String[] args) {
        ConsoleLogger logger = new ConsoleLogger();
        logger.write("Hello ");
        logger.write(1);
        logger.close();
    }
}
