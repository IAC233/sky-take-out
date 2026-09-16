package com.sky.mapper;

import com.sky.entity.SetmealDish;
import org.apache.ibatis.annotations.Mapper;

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
}
