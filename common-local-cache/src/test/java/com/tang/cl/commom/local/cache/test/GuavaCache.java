package com.tang.cl.commom.local.cache.test;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.util.concurrent.TimeUnit;

/**
 * @Author : chenglong.tang
 * @Description:
 * @Date: Created in 16:13 2019/3/15
 * @Modified By:
 * @Version :
 */
public class GuavaCache {

    public static void main(String[] args) {

        LoadingCache<String, Integer> cache =
                CacheBuilder.newBuilder().maximumSize(10)  //最多存放十个数据
                .expireAfterWrite(10, TimeUnit.SECONDS)  //缓存200秒
                .recordStats()   //开启 记录状态数据功能
                .build(new CacheLoader<String, Integer>() {
                    //数据加载，默认返回-1,也可以是查询操作，如从DB查询
                    @Override
                    public Integer load(String key) throws Exception {
                        return -1;
                    }
                });


    }
}
