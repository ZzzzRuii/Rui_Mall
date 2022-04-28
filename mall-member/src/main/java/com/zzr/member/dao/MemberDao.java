package com.zzr.member.dao;

import com.zzr.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zhouzhirui
 * @email zzr2635373196@icloud.com
 * @date 2022-04-28 16:00:08
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
