package demo.method;

import org.apache.log4j.Logger;

public class LoggerMethodTest
{
    private static Logger log = Logger.getLogger(LoggerMethodTest.class);

    public static void main(String[] args)
    {

        log.trace("Trace Message!");
        log.debug("Debug Message!");
        log.info("Info Message!");
        log.warn("Warn Message!");
        log.error("Error Message!");
    }

}
