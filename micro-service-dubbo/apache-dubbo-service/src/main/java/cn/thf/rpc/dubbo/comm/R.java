package cn.thf.rpc.dubbo.comm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Setter;

/**
 * @author TangHf
 * @descript 统一返回类
 * @date 2020/8/18 20:27 周二
 **/
@Data
@AllArgsConstructor
public class R {

    private String code;
    private String message;
    private String data;

    public static R success(String data) {
        R r = new R("000000", "交易成功", data);
        return r;
    }



}
