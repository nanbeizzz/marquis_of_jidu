package cn.thf.common.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author TangHf
 * @descript TODO
 * @date 2020/8/17 19:33 周一
 **/
public class Log4j2DemoApp {

    public static Logger logger = LoggerFactory.getLogger(Log4j2DemoApp.class);

    public static void main(String[] args) {

        logger.info("info. {}", "msg");
        logger.error("error. {}", "msg");

    }
}
