package com.imooc.coupon;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * <h1>操作模式的枚举定义</h1>
 * Created by Qinyi.
 */
@Getter
@AllArgsConstructor
public enum OpModeEnum {

    READ("读"),
    WRITE("写");

    private String mode;
}
