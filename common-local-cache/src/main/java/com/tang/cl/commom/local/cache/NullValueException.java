package com.tang.cl.commom.local.cache;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 12:28 2019/3/19
 * @Modified By:
 * @Version :
 */
public class NullValueException extends LocalCacheException {

    private static final long serialVersionUID = 2744507734870036592L;

    public NullValueException() {
        super();
    }

    public NullValueException(String message) {
        super(message);
    }

    public NullValueException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullValueException(Throwable cause) {
        super(cause);
    }
}
