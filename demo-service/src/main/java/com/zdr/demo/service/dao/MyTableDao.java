package com.zdr.demo.service.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zdr.demo.service.domain.Mytable;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zhangdongrun
 * @date 2019/3/27 下午10:20
 */

//@Mapper
public interface MyTableDao extends BaseMapper<Mytable> {
}
