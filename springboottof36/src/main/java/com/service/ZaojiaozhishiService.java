package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZaojiaozhishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZaojiaozhishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZaojiaozhishiView;


/**
 * 早教知识
 *
 * @author 
 * @email 
 * @date 2021-03-18 20:52:08
 */
public interface ZaojiaozhishiService extends IService<ZaojiaozhishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZaojiaozhishiVO> selectListVO(Wrapper<ZaojiaozhishiEntity> wrapper);
   	
   	ZaojiaozhishiVO selectVO(@Param("ew") Wrapper<ZaojiaozhishiEntity> wrapper);
   	
   	List<ZaojiaozhishiView> selectListView(Wrapper<ZaojiaozhishiEntity> wrapper);
   	
   	ZaojiaozhishiView selectView(@Param("ew") Wrapper<ZaojiaozhishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZaojiaozhishiEntity> wrapper);
   	
}

