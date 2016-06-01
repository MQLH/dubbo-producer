package com.hq.producer.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hq.register.pojo.User;
import com.hq.register.service.DubboService;

/**
 * Description: 注册服务实现
 *
 * ClassName:DemoServiceImpl Date: 2016年5月30日 下午5:32:36
 * 
 * @author lihao.qiu
 * @version
 * @since JDK 1.8 Copyright (c) 2016, o2o-lottery All Rights Reserved.
 */
@Service("dubboService")
public class DubboServiceImpl implements DubboService {
	public String sayHello(String name) {
		return "Hello " + name;
	}

	public List<User> getUsers() {
		List<User> list = new ArrayList<User>();
		User u1 = new User();
		User u2 = new User();
		
		u1.setName("qiang.meng");
		u1.setAge(20);
		u1.setSex("gentleman");

		u2.setName("lihao.qiu");
		u2.setAge(21);
		u2.setSex("birds and beasts");

		list.add(u1);
		list.add(u2);

		return list;
	}
}
