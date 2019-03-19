package com.tang.cl.commom.model.rpc;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 16:43 2019/3/15
 * @Modified By:
 * @Version :
 */
@Data
public class RpcResult<T> implements Serializable {

    /**
     * 成功码
     */
    public static final int SUCCESS_CODE = 200;

    /**
     * 返回码
     */
    private int code;

    /**
     * 错误信息
     */
    private String errorMsg;

    /**
     * 返回结果
     */
    private T data;

    /**
     * 构造器
     */
    public RpcResult() {
    }

    /**
     * 构造器
     *
     * @param code
     * @param errorMsg
     * @param data
     */
    public RpcResult(int code, String errorMsg, T data) {
        this.code = code;
        this.errorMsg = errorMsg;
        this.data = data;
    }

    /**
     * 成功
     *
     * @param data
     * @return
     */
    public RpcResult<T> success(T data) {

        this.data = data;
        this.code = SUCCESS_CODE;
        this.errorMsg = null;

        return this;
    }

    /**
     * 失败
     *
     * @param code
     * @param errorMsg
     * @return
     */
    public RpcResult<T> fail(int code, String errorMsg) {

        this.code = code;
        this.errorMsg = errorMsg;
        this.data = null;

        return this;
    }

}
