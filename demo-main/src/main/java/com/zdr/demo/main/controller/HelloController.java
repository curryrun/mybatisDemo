package com.zdr.demo.main.controller;

import com.alibaba.fastjson.JSONObject;
import com.zdr.demo.service.dao.ADao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class HelloController {

    private final static Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private ADao aDao;

    @RequestMapping(value = "/get1", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public JSONObject Hello1() {
//        aDao.selectList
        JSONObject res = new JSONObject();
        res.put("code", 111);
        res.put("name", 222);
        return res;
    }

}
