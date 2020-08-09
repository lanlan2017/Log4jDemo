package demo.file.appender;

import java.io.IOException;
import java.sql.SQLException;
import org.apache.log4j.Logger;
import demo.Log4jExample;

public class XMLFileAppenderTest
{

//    static
//    {
//        System.setProperty("log", "E:/workspacne_JDK8Tomcat8.5/Log4jDemo");
//    }
    /* Get actual class name to be printed on */
    static Logger log = Logger.getLogger(Log4jExample.class.getName());

    public static void main(String[] args) throws IOException, SQLException
    {
        log.debug("Hello this is a debug message");
        log.info("Hello this is an info message");
    }
}
