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


import com.dao.HaowuleixingDao;
import com.entity.HaowuleixingEntity;
import com.service.HaowuleixingService;
import com.entity.vo.HaowuleixingVO;
import com.entity.view.HaowuleixingView;

@Service("haowuleixingService")
public class HaowuleixingServiceImpl extends ServiceImpl<HaowuleixingDao, HaowuleixingEntity> implements HaowuleixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HaowuleixingEntity> page = this.selectPage(
                new Query<HaowuleixingEntity>(params).getPage(),
                new EntityWrapper<HaowuleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HaowuleixingEntity> wrapper) {
		  Page<HaowuleixingView> page =new Query<HaowuleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HaowuleixingVO> selectListVO(Wrapper<HaowuleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HaowuleixingVO selectVO(Wrapper<HaowuleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HaowuleixingView> selectListView(Wrapper<HaowuleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HaowuleixingView selectView(Wrapper<HaowuleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
