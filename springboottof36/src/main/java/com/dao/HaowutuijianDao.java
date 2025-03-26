package com.dao;

import com.entity.HaowutuijianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HaowutuijianVO;
import com.entity.view.HaowutuijianView;


/**
 * 好物推荐
 * 
 * @author 
 * @email 
 * @date 2021-03-18 20:52:08
 */
public interface HaowutuijianDao extends BaseMapper<HaowutuijianEntity> {
	
	List<HaowutuijianVO> selectListVO(@Param("ew") Wrapper<HaowutuijianEntity> wrapper);
	
	HaowutuijianVO selectVO(@Param("ew") Wrapper<HaowutuijianEntity> wrapper);
	
	List<HaowutuijianView> selectListView(@Param("ew") Wrapper<HaowutuijianEntity> wrapper);

	List<HaowutuijianView> selectListView(Pagination page,@Param("ew") Wrapper<HaowutuijianEntity> wrapper);
	
	HaowutuijianView selectView(@Param("ew") Wrapper<HaowutuijianEntity> wrapper);
	
}
