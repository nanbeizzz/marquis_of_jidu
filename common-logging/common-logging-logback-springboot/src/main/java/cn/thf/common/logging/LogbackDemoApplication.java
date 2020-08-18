package cn.thf.common.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author TangHf
 * @descript TODO
 * @date 2020/8/18 16:35 周二
 **/
@SpringBootApplication
public class LogbackDemoApplication {

    public static Logger logger = LoggerFactory.getLogger(LogbackDemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(LogbackDemoApplication.class);
        logger.info("info. {}", "msg");
    }
}
