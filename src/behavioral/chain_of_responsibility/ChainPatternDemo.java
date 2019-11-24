package behavioral.chain_of_responsibility;

public class ChainPatternDemo {

    private static AbstractLogger getChainOfLoggers() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger logger = getChainOfLoggers();

        logger.logMessage(AbstractLogger.INFO, "Info Message");
        logger.logMessage(AbstractLogger.DEBUG, "Debug Message");
        logger.logMessage(AbstractLogger.ERROR, "Error Message");
    }
}
