package cn.edu.xidian.tafei_mall.mapper;

import cn.edu.xidian.tafei_mall.model.entity.Cart;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;

/**
 * <p>
 * 购物车表 Mapper 接口
 * </p>
 *
 * @author shenyaoguan
 * @since 2025-03-17
 */
@Mapper
public interface CartMapper extends BaseMapper<Cart> {
  @Insert("INSERT INTO cart (cart_id, user_id, created_at, updated_at) " +
            "VALUES (#{cartId}, #{userId}, #{createdAt}, #{updatedAt})")
    @Options(useGeneratedKeys = true, keyProperty = "cartId")
    int insertCart(Cart cart);
}
