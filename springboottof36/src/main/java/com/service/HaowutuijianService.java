package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HaowutuijianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HaowutuijianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HaowutuijianView;


/**
 * 好物推荐
 *
 * @author 
 * @email 
 * @date 2021-03-18 20:52:08
 */
public interface HaowutuijianService extends IService<HaowutuijianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HaowutuijianVO> selectListVO(Wrapper<HaowutuijianEntity> wrapper);
   	
   	HaowutuijianVO selectVO(@Param("ew") Wrapper<HaowutuijianEntity> wrapper);
   	
   	List<HaowutuijianView> selectListView(Wrapper<HaowutuijianEntity> wrapper);
   	
   	HaowutuijianView selectView(@Param("ew") Wrapper<HaowutuijianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HaowutuijianEntity> wrapper);
   	
}

