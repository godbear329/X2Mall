package com.xmy.x2mall.member.dao;

import com.xmy.x2mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author xmy
 * @email xmy329@gmail.com
 * @date 2021-06-11 22:31:38
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
