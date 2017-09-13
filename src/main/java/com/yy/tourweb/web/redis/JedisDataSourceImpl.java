package com.yy.tourweb.web.redis;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;

/**
 * Jedis实例管理实现类
 * @author yy
 *
 */
@Repository("jedisDS")
public class JedisDataSourceImpl implements JedisDataSource {

//	private static final Logger LOG = LoggerFactory.getLogger(JedisDataSourceImpl.class);
    
	@Resource
    private ShardedJedisPool shardedJedisPool;
    
    @Override
    public ShardedJedis getRedisClient() {
        ShardedJedis shardJedis = null;
        try {
            shardJedis = shardedJedisPool.getResource();
            return shardJedis;
        } catch (Exception e) {
//            LOG.error("[JedisDS] getRedisClent error:" + e.getMessage());
            if (null != shardJedis)
                shardJedis.close();
        }
        return null;
    }

    @Override
    public void returnResource(ShardedJedis shardedJedis) {
        shardedJedis.close();
    }

    @Override
    public void returnResource(ShardedJedis shardedJedis, boolean broken) {
        shardedJedis.close();
    }

}
