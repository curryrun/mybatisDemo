package com.zdr.demo.service;

import com.zdr.demo.service.dao.MyTableDao;
import com.zdr.demo.service.domain.Mytable;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author zhangdongrun
 * @date 2019/3/28 上午11:09
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MyTest {

    @Autowired
    private MyTableDao aDao;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<Mytable> userList = aDao.selectList(null);
        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }

}
