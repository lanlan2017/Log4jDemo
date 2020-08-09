package demo.level;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class SetLevelByMethod
{
    private static Logger log = Logger.getLogger(SetLevelByMethod.class);

    public static void main(String[] args)
    {
        // 使用方法设置日志级别
        log.setLevel(Level.WARN);
        log.trace("Trace Message!");
        log.debug("Debug Message!");
        log.info("Info Message!");
        log.warn("Warn Message!");
        log.error("Error Message!");
        log.fatal("Fatal Message!");
    }
}
