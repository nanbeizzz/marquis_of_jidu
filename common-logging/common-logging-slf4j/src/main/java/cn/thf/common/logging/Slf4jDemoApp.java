package cn.thf.common.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author TangHf
 * @descript TODO
 * @date 2020/8/18 9:19 周二
 **/
public class Slf4jDemoApp {

    public static Logger logger = LoggerFactory.getLogger(Slf4jDemoApp.class);

    public static void main(String[] args) {
        logger.info("info. " + "msg");
        logger.warn("warn. " + "msg");
    }
}
