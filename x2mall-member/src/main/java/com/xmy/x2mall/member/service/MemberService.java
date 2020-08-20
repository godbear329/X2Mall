package com.xmy.x2mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xmy.common.utils.PageUtils;
import com.xmy.x2mall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author X2
 * @email xmy329@gmail.com
 * @date 2020-07-25 14:57:46
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
