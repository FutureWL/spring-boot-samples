package io.github.futurewl;

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingSimple {
    private static Logger logger = Logger.getLogger(LoggingSimple.class.toString());

    static {
        Handler console = new ConsoleHandler();
        console.setLevel(Level.SEVERE);
        logger.addHandler(console);
    }

    public static void main(String[] args) {
        logger.setLevel(Level.INFO);
        logger.finest("finest");
        logger.finer("finer");
        logger.fine("fine");
        logger.config("config");
        logger.info("info");
        logger.warning("warning");
        logger.severe("severe");
    }
}
