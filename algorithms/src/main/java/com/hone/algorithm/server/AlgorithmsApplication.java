package com.hone.algorithm.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>权限中心</p>
 * @author hourz
 * @since 2019-06-10
 */
@SpringBootApplication
public class AlgorithmsApplication {

	public static final Logger logger = LoggerFactory.getLogger(AlgorithmsApplication.class);

	public static void main(String[] args) {
		logger.info("用户权限中心 ---> 启动！");
		SpringApplication.run(AlgorithmsApplication.class, args);
	}

}
