package com.zdr.demo.service.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @author zhangdongrun
 * @date 2019/3/27 下午10:21
 */
@Data
public class Mytable {

    @TableId
    private int a;

}
