package com.tdh.session.sharing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 
 * @ClassName: Application
 * @Description: (session共享应用启动器)
 * @author wxf
 * @date 2019年2月27日 下午5:31:35
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = { "com.tdh.session.sharing.*" })
public class Application {
	static Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		logger.info("sessionSharing started successfully");
	}
}
