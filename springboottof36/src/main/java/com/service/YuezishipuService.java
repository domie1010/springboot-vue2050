package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuezishipuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuezishipuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuezishipuView;


/**
 * 月子食谱
 *
 * @author 
 * @email 
 * @date 2021-03-18 20:52:08
 */
public interface YuezishipuService extends IService<YuezishipuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuezishipuVO> selectListVO(Wrapper<YuezishipuEntity> wrapper);
   	
   	YuezishipuVO selectVO(@Param("ew") Wrapper<YuezishipuEntity> wrapper);
   	
   	List<YuezishipuView> selectListView(Wrapper<YuezishipuEntity> wrapper);
   	
   	YuezishipuView selectView(@Param("ew") Wrapper<YuezishipuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuezishipuEntity> wrapper);
   	
}

