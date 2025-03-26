package com.dao;

import com.entity.HaowuleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HaowuleixingVO;
import com.entity.view.HaowuleixingView;


/**
 * 好物类型
 * 
 * @author 
 * @email 
 * @date 2021-03-18 20:52:08
 */
public interface HaowuleixingDao extends BaseMapper<HaowuleixingEntity> {
	
	List<HaowuleixingVO> selectListVO(@Param("ew") Wrapper<HaowuleixingEntity> wrapper);
	
	HaowuleixingVO selectVO(@Param("ew") Wrapper<HaowuleixingEntity> wrapper);
	
	List<HaowuleixingView> selectListView(@Param("ew") Wrapper<HaowuleixingEntity> wrapper);

	List<HaowuleixingView> selectListView(Pagination page,@Param("ew") Wrapper<HaowuleixingEntity> wrapper);
	
	HaowuleixingView selectView(@Param("ew") Wrapper<HaowuleixingEntity> wrapper);
	
}
