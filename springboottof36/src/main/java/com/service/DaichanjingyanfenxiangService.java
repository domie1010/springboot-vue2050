package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DaichanjingyanfenxiangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DaichanjingyanfenxiangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DaichanjingyanfenxiangView;


/**
 * 待产经验分享
 *
 * @author 
 * @email 
 * @date 2021-03-18 20:52:08
 */
public interface DaichanjingyanfenxiangService extends IService<DaichanjingyanfenxiangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DaichanjingyanfenxiangVO> selectListVO(Wrapper<DaichanjingyanfenxiangEntity> wrapper);
   	
   	DaichanjingyanfenxiangVO selectVO(@Param("ew") Wrapper<DaichanjingyanfenxiangEntity> wrapper);
   	
   	List<DaichanjingyanfenxiangView> selectListView(Wrapper<DaichanjingyanfenxiangEntity> wrapper);
   	
   	DaichanjingyanfenxiangView selectView(@Param("ew") Wrapper<DaichanjingyanfenxiangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DaichanjingyanfenxiangEntity> wrapper);
   	
}

