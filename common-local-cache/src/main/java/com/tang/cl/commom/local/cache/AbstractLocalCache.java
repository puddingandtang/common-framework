package com.tang.cl.commom.local.cache;

import com.google.common.cache.Cache;

/**
 * @Author : chenglong.tang
 * @Description: 基于Guava的cache进行包装的本地缓存
 * @Date: Created in 15:59 2019/3/15
 * @Modified By:
 * @Version :
 */
public class AbstractLocalCache<K, V> {

    private Cache<K, Object> cache;

}
