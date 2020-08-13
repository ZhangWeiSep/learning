package indi.zhangweisep.learning.modules.system.entity;

import indi.zhangweisep.learning.common.base.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 微信用户表——实体类
 * </p>
 *
 * @author Zhang Wei
 * @since 2020-04-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ToString(callSuper = true)
public class WxUser extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private String id;

    /**
     * 系统登陆用户
     */
    private String sysUserName;

    /**
     * 微信用户的openid
     */
    private String openid;

    /**
     * 联系电话（接受验证码用的）
     */
    private String phone;

    /**
     * 真实名称
     */
    private String realname;

    /**
     * 关注时间
     */
    private String focustime;

    /**
     * 微信用户状态标志
     */
    private Boolean mark;


}
