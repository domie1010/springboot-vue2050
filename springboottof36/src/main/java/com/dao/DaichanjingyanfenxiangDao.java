package com.dao;

import com.entity.DaichanjingyanfenxiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DaichanjingyanfenxiangVO;
import com.entity.view.DaichanjingyanfenxiangView;


/**
 * 待产经验分享
 * 
 * @author 
 * @email 
 * @date 2021-03-18 20:52:08
 */
public interface DaichanjingyanfenxiangDao extends BaseMapper<DaichanjingyanfenxiangEntity> {
	
	List<DaichanjingyanfenxiangVO> selectListVO(@Param("ew") Wrapper<DaichanjingyanfenxiangEntity> wrapper);
	
	DaichanjingyanfenxiangVO selectVO(@Param("ew") Wrapper<DaichanjingyanfenxiangEntity> wrapper);
	
	List<DaichanjingyanfenxiangView> selectListView(@Param("ew") Wrapper<DaichanjingyanfenxiangEntity> wrapper);

	List<DaichanjingyanfenxiangView> selectListView(Pagination page,@Param("ew") Wrapper<DaichanjingyanfenxiangEntity> wrapper);
	
	DaichanjingyanfenxiangView selectView(@Param("ew") Wrapper<DaichanjingyanfenxiangEntity> wrapper);
	
}
