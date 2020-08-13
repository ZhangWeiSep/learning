package indi.zhangweisep.learning.system.controller;

import indi.zhangweisep.learning.modules.system.entity.SysUser;
import org.springframework.web.bind.annotation.*;

/**
 * 用户信息管理
 *
 * @author: ZhangWei
 * @since: 2020/4/14 15:00
 */
@RestController
@RequestMapping("/sysUser")
public class SysUserController {

    @PostMapping("/testApi")
    public String testApi(@RequestBody SysUser sysUser) {
        return "index";
    }

    @GetMapping("/getTestApi")
    public String getTestApi() {
        return "测试";
    }

    @GetMapping("/getTestUser")
    public String getTestUser() {
        return "测试User";
    }

    @PostMapping("/findUser")
    public SysUser findUser(@RequestBody SysUser sysUser) {
        return sysUser;
    }

}
