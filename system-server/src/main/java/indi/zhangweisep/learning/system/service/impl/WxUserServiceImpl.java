package indi.zhangweisep.learning.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import indi.zhangweisep.learning.modules.system.entity.WxUser;
import indi.zhangweisep.learning.modules.system.mapper.WxUserMapper;
import indi.zhangweisep.learning.system.service.WxUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 微信用户表 服务实现类
 * </p>
 *
 * @author Zhang Wei
 * @since 2020-04-13
 */
@Service
public class WxUserServiceImpl extends ServiceImpl<WxUserMapper, WxUser> implements WxUserService {

}
