package cn.thf.rpc.dubbo.service;

import cn.thf.rpc.dubbo.dto.HelloWordServiceRequest;
import cn.thf.rpc.dubbo.dto.HelloWordServiceResponse;

/**
 * @author TangHf
 * @descript TODO
 * @date 2020/8/18 19:42 周二
 **/
public interface HelloWordService {

    HelloWordServiceResponse execute(HelloWordServiceRequest request);
}
