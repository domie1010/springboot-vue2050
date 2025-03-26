package com.dao;

import com.entity.HuaiyunchangshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuaiyunchangshiVO;
import com.entity.view.HuaiyunchangshiView;


/**
 * 怀孕常识
 * 
 * @author 
 * @email 
 * @date 2021-03-18 20:52:08
 */
public interface HuaiyunchangshiDao extends BaseMapper<HuaiyunchangshiEntity> {
	
	List<HuaiyunchangshiVO> selectListVO(@Param("ew") Wrapper<HuaiyunchangshiEntity> wrapper);
	
	HuaiyunchangshiVO selectVO(@Param("ew") Wrapper<HuaiyunchangshiEntity> wrapper);
	
	List<HuaiyunchangshiView> selectListView(@Param("ew") Wrapper<HuaiyunchangshiEntity> wrapper);

	List<HuaiyunchangshiView> selectListView(Pagination page,@Param("ew") Wrapper<HuaiyunchangshiEntity> wrapper);
	
	HuaiyunchangshiView selectView(@Param("ew") Wrapper<HuaiyunchangshiEntity> wrapper);
	
}
