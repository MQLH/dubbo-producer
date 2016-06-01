package com.hq.producer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description: 注册服务的生产者
 *
 * ClassName:Provider Date: 2016年5月30日 下午5:34:54
 * 
 * @author lihao.qiu
 * @version
 * @since JDK 1.8 Copyright (c) 2016, o2o-lottery All Rights Reserved.
 */
public class Provider {
	private static ClassPathXmlApplicationContext context;

	public static void main(String[] args) throws Exception {
		// Create a new ClassPathXmlApplicationContext, loading the definitions
		context = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext.xml" });
		// Start this component
		context.start();
		// 为保证服务一直开着，利用输入流的阻塞来模拟
		System.in.read();
	}
}
