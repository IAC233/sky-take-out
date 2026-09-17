package com.sky.mapper;

import com.sky.entity.SetmealDish;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SetmealDishMapper {
    /**
     * 根据菜品id列表查询对应的套餐id列表
     * @param dishIds
     * @return
     */
    List<Long> getSetmealDishIdsByDishIds(List<Long> dishIds);

    /**
     * 批量插入套餐菜品信息
     * @param setmealDishes
     */
    void insertBatch(List<SetmealDish> setmealDishes);

    /**
     * 根据套餐id列表删除套餐菜品信息
     * @param ids
     */
    void deleteBySetmealIds(List<Long> ids);

    /**
     * 根据套餐id查询套餐菜品信息
     * @param setmealId
     * @return
     */
    @Select("SELECT * FROM setmeal_dish WHERE setmeal_id = #{setmealId}")
    List<SetmealDish> getBySetmealId(Long setmealId);


    /**
     * 根据套餐id删除套餐菜品信息
     * @param setmealId
     */
    void deleteBySetmealId(Long setmealId);
}
