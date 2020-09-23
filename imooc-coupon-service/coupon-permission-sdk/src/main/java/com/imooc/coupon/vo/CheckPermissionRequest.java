package com.imooc.coupon.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <h1>权限校验请求对象定义</h1>
 * Created by Qinyi.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CheckPermissionRequest {

   private Long userId;
   private String uri;
   private String httpMethod;
}
