package cn.thf.common.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author TangHf
 * @descript TODO
 * @date 2020/8/17 20:06 周一
 **/
@SpringBootApplication
public class Log4j2DemoApplication {

    public static Logger logger = LoggerFactory.getLogger(Log4j2DemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(Log4j2DemoApplication.class);
        logger.info("info. {}", "something");
    }

}
