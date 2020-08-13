package indi.zhangweisep.learning.common.base.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * <p>
 * 实体类的抽象<br/>
 * 所有实体类都继承这个类<br/>
 * 声明公共的实体属性
 * </p>
 *
 * @author ZhangWei
 * @since 2020/4/15 10:37
 */
@Data
public class BaseEntity {

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改人
     */
    private String modifyUser;

    /**
     * 修改时间
     */
    private LocalDateTime modifyTime;

    /**
     * 备注
     */
    private String remark;

    /**
     * 删除标识
     */
    private Boolean delFlag;

}
