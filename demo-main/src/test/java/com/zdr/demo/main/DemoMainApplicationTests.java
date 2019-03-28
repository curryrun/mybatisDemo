package com.zdr.demo.main;

import com.zdr.demo.service.dao.MyTableDao;
import com.zdr.demo.service.domain.Mytable;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoMainApplicationTests {

	@Autowired
	private MyTableDao myTableDao;

	@Test
	public void testSelect() {
		System.out.println(("----- selectAll method test ------"));
		List<Mytable> userList = myTableDao.selectList(null);
//		Assert.assertEquals(5, userList.size());
		userList.forEach(System.out::println);
	}

}
