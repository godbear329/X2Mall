package com.xmy.x2mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xmy.x2mall.common.utils.PageUtils;
import com.xmy.x2mall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author xmy
 * @email xmy329@gmail.com
 * @date 2021-06-11 22:31:38
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

