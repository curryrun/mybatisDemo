package com.zdr.demo.main.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zdr.demo.service.dao.MyTableDao;
import com.zdr.demo.service.domain.Mytable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/demo")
public class HelloController {

    private final static Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private MyTableDao myTableDao;

    @RequestMapping(value = "/get1", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public String Hello1() {
        List<Mytable> mytables = myTableDao.selectList(null);
//        aDao.selectList
        JSONObject res = new JSONObject();
        res.put("code", 111);
        res.put("name", 222);
        return JSON.toJSONString(mytables);
    }

}
