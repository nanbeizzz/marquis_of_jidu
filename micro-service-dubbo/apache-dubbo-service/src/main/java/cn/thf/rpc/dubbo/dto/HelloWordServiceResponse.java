package cn.thf.rpc.dubbo.dto;

import lombok.Data;

/**
 * @author TangHf
 * @descript TODO
 * @date 2020/8/18 19:43 周二
 **/
@Data
public class HelloWordServiceResponse {

    private String code;
    private String message;

    private String transcode;

}
