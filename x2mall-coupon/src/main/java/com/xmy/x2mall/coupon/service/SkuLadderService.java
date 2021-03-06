package com.xmy.x2mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xmy.x2mall.common.utils.PageUtils;
import com.xmy.x2mall.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author xmy
 * @email xmy329@gmail.com
 * @date 2021-06-13 16:59:40
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

