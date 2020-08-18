package cn.thf.rpc.dubbo.service.impl;

import cn.thf.rpc.dubbo.dto.HelloWordServiceRequest;
import cn.thf.rpc.dubbo.dto.HelloWordServiceResponse;
import cn.thf.rpc.dubbo.service.HelloWordService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author TangHf
 * @descript TODO
 * @date 2020/8/18 19:41 周二
 **/
@Service(version = "1.0")
@Slf4j
public class HelloWordServiceImpl implements HelloWordService {

    @Override
    public HelloWordServiceResponse execute(HelloWordServiceRequest request) {

        log.debug("request param : {}", request);
        HelloWordServiceResponse response = new HelloWordServiceResponse();
        response.setCode("000000");
        response.setMessage("");
        response.setTranscode(request.getTranscode());
        return response;

    }
}
