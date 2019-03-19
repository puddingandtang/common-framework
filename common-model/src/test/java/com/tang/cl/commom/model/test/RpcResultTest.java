package com.tang.cl.commom.model.test;

import com.tang.cl.commom.model.rpc.RpcResult;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 16:57 2019/3/15
 * @Modified By:
 * @Version :
 */
public class RpcResultTest {

    public static void main(String[] args) {

        RpcResult result = new RpcResult();
        System.out.println(result);

        result.success("Hello World");

        System.out.println(result);

        result.fail(404,"异常");
        System.out.println(result);

    }
}
