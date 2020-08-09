package demo.level;

import org.apache.log4j.Logger;

public class SetLevleByConfig
{
    private static Logger log = Logger.getLogger(SetLevleByConfig.class);

    public static void main(String[] args)
    {

        log.trace("Trace Message!");
        log.debug("Debug Message!");
        log.info("Info Message!");
        log.warn("Warn Message!");
        log.error("Error Message!");
        log.fatal("Fatal Message!");
    }
}
