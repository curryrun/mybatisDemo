package com.zdr.demo.service.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author zhangdongrun
 * @date 2019/3/27 下午10:21
 */
@Data
@TableName("my_table")
public class Mytable {

    @TableId
    private int a;

}
