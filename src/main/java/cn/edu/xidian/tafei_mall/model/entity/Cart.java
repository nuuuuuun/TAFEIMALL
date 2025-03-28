package cn.edu.xidian.tafei_mall.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 购物车表
 * </p>
 *
 * @author shenyaoguan
 * @since 2025-03-17
 */
@Getter
@Setter
@TableName("cart")
@ApiModel(value = "Cart对象", description = "购物车表")
public class Cart implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("购物车ID")
    @TableId(value = "cart_id", type = IdType.INPUT)
    private String cartId;

    @ApiModelProperty("用户ID")
    @TableField("user_id")
    private String userId;

    @ApiModelProperty("创建时间")
    @TableField("created_at")
    private LocalDateTime createdAt;

    @ApiModelProperty("更新时间")
    @TableField("updated_at")
    private LocalDateTime updatedAt;

    public Cart() {
        this.cartId = UUID.randomUUID().toString(); // 生成 UUID
        this.createdAt = LocalDateTime.now(); // 设置创建时间
        this.updatedAt = LocalDateTime.now(); // 设置更新时间
    }
}
