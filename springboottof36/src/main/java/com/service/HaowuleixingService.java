package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HaowuleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HaowuleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HaowuleixingView;


/**
 * 好物类型
 *
 * @author 
 * @email 
 * @date 2021-03-18 20:52:08
 */
public interface HaowuleixingService extends IService<HaowuleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HaowuleixingVO> selectListVO(Wrapper<HaowuleixingEntity> wrapper);
   	
   	HaowuleixingVO selectVO(@Param("ew") Wrapper<HaowuleixingEntity> wrapper);
   	
   	List<HaowuleixingView> selectListView(Wrapper<HaowuleixingEntity> wrapper);
   	
   	HaowuleixingView selectView(@Param("ew") Wrapper<HaowuleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HaowuleixingEntity> wrapper);
   	
}

