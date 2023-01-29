package Log4J;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class C01_log4J_01 {
    //Logger objesi oluştur.
    //private static Logger Logger=LogManeger.getLogger(Demo1.class.getName());
    //Logger fonksiyonuyla istenilen fonksiyonu kullan
    //      logger.debug/("Debug logger");
    //      logger.info("info logger");
    //      logger.error("Error logger"),
    //      logger.fatal("fatal logger");

    private static Logger logger= LogManager.getLogger(C01_log4J_01.class.getName());

    @Test

    public void log4JTest(){
        //      logger objesi ile yazdırma işlemi
        logger.fatal("fatal log!");
        logger.error("error log!");
        logger.warn("Warm Log!");
        logger.debug("Debug log!");
        logger.info("info log!");

    }
}
