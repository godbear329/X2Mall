package com.xmy.x2mall.order.dao;

import com.xmy.x2mall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author xmy
 * @email xmy329@gmail.com
 * @date 2021-06-13 16:26:25
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
