package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuaiyunchangshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuaiyunchangshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuaiyunchangshiView;


/**
 * 怀孕常识
 *
 * @author 
 * @email 
 * @date 2021-03-18 20:52:08
 */
public interface HuaiyunchangshiService extends IService<HuaiyunchangshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuaiyunchangshiVO> selectListVO(Wrapper<HuaiyunchangshiEntity> wrapper);
   	
   	HuaiyunchangshiVO selectVO(@Param("ew") Wrapper<HuaiyunchangshiEntity> wrapper);
   	
   	List<HuaiyunchangshiView> selectListView(Wrapper<HuaiyunchangshiEntity> wrapper);
   	
   	HuaiyunchangshiView selectView(@Param("ew") Wrapper<HuaiyunchangshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuaiyunchangshiEntity> wrapper);
   	
}

