package com.zhl.rpc;

import com.zhl.rpc.service.HelloService;
import com.zhl.rpc.service.impl.HelloServiceImpl;

/**
 * @author zhl
 * @create 2021/1/28 16:24
 * @description
 */
public class RpcProvider {
    public static void main(String[] args) throws Exception {
        HelloService service = new HelloServiceImpl();
        RpcFramework.export(service,1234);
    }
}
