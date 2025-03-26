package com.dao;

import com.entity.YuezishipuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuezishipuVO;
import com.entity.view.YuezishipuView;


/**
 * 月子食谱
 * 
 * @author 
 * @email 
 * @date 2021-03-18 20:52:08
 */
public interface YuezishipuDao extends BaseMapper<YuezishipuEntity> {
	
	List<YuezishipuVO> selectListVO(@Param("ew") Wrapper<YuezishipuEntity> wrapper);
	
	YuezishipuVO selectVO(@Param("ew") Wrapper<YuezishipuEntity> wrapper);
	
	List<YuezishipuView> selectListView(@Param("ew") Wrapper<YuezishipuEntity> wrapper);

	List<YuezishipuView> selectListView(Pagination page,@Param("ew") Wrapper<YuezishipuEntity> wrapper);
	
	YuezishipuView selectView(@Param("ew") Wrapper<YuezishipuEntity> wrapper);
	
}
