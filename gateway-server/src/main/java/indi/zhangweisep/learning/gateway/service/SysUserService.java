package indi.zhangweisep.learning.gateway.service;

import indi.zhangweisep.learning.modules.system.entity.SysUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * <p>
 * 用户管理服务
 * </p>
 *
 * @author: ZhangWei
 * @since: 2020/4/21 14:28
 */
@FeignClient(value = "SYSTEM-SERVER")
public interface SysUserService {

    @PostMapping("/findUser")
    SysUser findUser(@RequestBody SysUser sysUser);


}
