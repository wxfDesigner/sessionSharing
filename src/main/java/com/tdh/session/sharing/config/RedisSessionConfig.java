package com.tdh.session.sharing.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * 
 * @ClassName: RedisSessionConfig  
 * @Description: (redisSession配置类)  
 * @author wxf
 * @date 2019年2月27日 下午5:52:36  
 *
 */
@Configuration  
@EnableRedisHttpSession
public class RedisSessionConfig {

}
