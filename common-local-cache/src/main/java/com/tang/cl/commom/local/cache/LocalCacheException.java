package com.tang.cl.commom.local.cache;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 12:28 2019/3/19
 * @Modified By:
 * @Version :
 */
public class LocalCacheException extends RuntimeException{

    private static final long serialVersionUID = -6361406373564038557L;

    public LocalCacheException() {
        super();
    }

    public LocalCacheException(String message) {
        super(message);
    }

    public LocalCacheException(String message, Throwable cause) {
        super(message, cause);
    }

    public LocalCacheException(Throwable cause) {
        super(cause);
    }
}
