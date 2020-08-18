package cn.thf.rpc.dubbo;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author TangHf
 * @descript TODO
 * @date 2020/8/18 17:53 周二
 **/
@SpringBootApplication
@EnableDubbo
public class ApacheDubboServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApacheDubboServiceApplication.class);
    }
}
