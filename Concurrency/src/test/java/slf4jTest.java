import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class slf4jTest {

private final static Logger logger = LoggerFactory.getLogger(slf4jTest.class);
        public static void main(String[] args) {
                logger.info("logback 成功了");
                logger.error("logback 成功了");
                logger.debug("logback 成功了");
        }
}
