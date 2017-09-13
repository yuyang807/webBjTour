package com.yy.tourweb.web.redis;

import redis.clients.jedis.ShardedJedis;

/**
 * Jedis实例管理
 * @author yy
 *
 */
public interface JedisDataSource {

	/**
	 * 获取jedis实例
	 * @return 实例
	 */
	public ShardedJedis getRedisClient();
	
	/**
	 * jedis实例回收
	 * @param shardedJedis
	 */
	public void returnResource(ShardedJedis shardedJedis);
	
	/**
	 * jedis实例回收
	 * @param shardedJedis
	 * @param broken
	 */
	public void returnResource(ShardedJedis shardedJedis, boolean broken);
}
