package com.amall.common;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * Guava实现的本地缓存
 * @author lenovo
 */
public class TokenCache {
    private static final String NULL_VALUE = "null";
    public static final String TOKEN_PREFIX = "token_";
    private static Logger logger = LoggerFactory.getLogger(TokenCache.class);
    /**
     * 设置本地缓存的大小
     * 若是超过最大值，Guava会根据LRU算法移出
     */
    private static LoadingCache<String, String> localCache = CacheBuilder
            .newBuilder().initialCapacity(1000).maximumSize(10000)
            .expireAfterAccess(12, TimeUnit.HOURS)
            .build(new CacheLoader<String, String>() {
                //默认的数据加载实现，当调用get取值的时候，
                //若key没有对应的值，就调用这个方法进行加载
                @Override
                public String load(String s) throws Exception {
                    //防止后面调用的时候空指针异常
                    return NULL_VALUE;
                }
            });

    public static void setKey(String key, String value) {
        localCache.put(key, value);
    }

    public static String getKey(String key) {
        String value = "";
        try {
            value = localCache.get(key);
            if (NULL_VALUE.equals(value)) {
                return null;
            }
        } catch (ExecutionException e) {
            logger.error("localCache get error", e);
        }
        return value;
    }
}
