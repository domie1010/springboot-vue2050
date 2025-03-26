package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YuezishipuDao;
import com.entity.YuezishipuEntity;
import com.service.YuezishipuService;
import com.entity.vo.YuezishipuVO;
import com.entity.view.YuezishipuView;

@Service("yuezishipuService")
public class YuezishipuServiceImpl extends ServiceImpl<YuezishipuDao, YuezishipuEntity> implements YuezishipuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuezishipuEntity> page = this.selectPage(
                new Query<YuezishipuEntity>(params).getPage(),
                new EntityWrapper<YuezishipuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuezishipuEntity> wrapper) {
		  Page<YuezishipuView> page =new Query<YuezishipuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuezishipuVO> selectListVO(Wrapper<YuezishipuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuezishipuVO selectVO(Wrapper<YuezishipuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuezishipuView> selectListView(Wrapper<YuezishipuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuezishipuView selectView(Wrapper<YuezishipuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
