package com.sky.mapper;

import com.sky.entity.ShoppingCart;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface ShoppingCartMapper {

    /**
     * 根据条件查询购物车
     * @param shoppingCart
     * @return
     */
    List<ShoppingCart> list(ShoppingCart shoppingCart);


    /**
     * 根据id更新购物车数量
     * @param shoppingCart
     */
    @Update("update shopping_cart set number = #{number} where id = #{id}")
    void updateNumberById(ShoppingCart shoppingCart);


    /**
     * 添加购物车
     * @param shoppingCart
     */
    @Insert("insert into shopping_cart (user_id, dish_id, setmeal_id, name, image, dish_flavor,amount, number, create_time) " +
            "values (#{userId}, #{dishId}, #{setmealId}, #{name}, #{image}, #{dishFlavor}, #{amount}, #{number}, #{createTime})")
    void insert(ShoppingCart shoppingCart);

    /**
     * 根据用户id删除购物车
     * @param userId
     */
    @Delete("delete from shopping_cart where user_id = #{userId}")
    void deleteByUserId(Long userId);
}
