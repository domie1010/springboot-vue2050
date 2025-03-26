package com.dao;

import com.entity.ZaojiaozhishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZaojiaozhishiVO;
import com.entity.view.ZaojiaozhishiView;


/**
 * 早教知识
 * 
 * @author 
 * @email 
 * @date 2021-03-18 20:52:08
 */
public interface ZaojiaozhishiDao extends BaseMapper<ZaojiaozhishiEntity> {
	
	List<ZaojiaozhishiVO> selectListVO(@Param("ew") Wrapper<ZaojiaozhishiEntity> wrapper);
	
	ZaojiaozhishiVO selectVO(@Param("ew") Wrapper<ZaojiaozhishiEntity> wrapper);
	
	List<ZaojiaozhishiView> selectListView(@Param("ew") Wrapper<ZaojiaozhishiEntity> wrapper);

	List<ZaojiaozhishiView> selectListView(Pagination page,@Param("ew") Wrapper<ZaojiaozhishiEntity> wrapper);
	
	ZaojiaozhishiView selectView(@Param("ew") Wrapper<ZaojiaozhishiEntity> wrapper);
	
}
