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


import com.dao.HaowutuijianDao;
import com.entity.HaowutuijianEntity;
import com.service.HaowutuijianService;
import com.entity.vo.HaowutuijianVO;
import com.entity.view.HaowutuijianView;

@Service("haowutuijianService")
public class HaowutuijianServiceImpl extends ServiceImpl<HaowutuijianDao, HaowutuijianEntity> implements HaowutuijianService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HaowutuijianEntity> page = this.selectPage(
                new Query<HaowutuijianEntity>(params).getPage(),
                new EntityWrapper<HaowutuijianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HaowutuijianEntity> wrapper) {
		  Page<HaowutuijianView> page =new Query<HaowutuijianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HaowutuijianVO> selectListVO(Wrapper<HaowutuijianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HaowutuijianVO selectVO(Wrapper<HaowutuijianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HaowutuijianView> selectListView(Wrapper<HaowutuijianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HaowutuijianView selectView(Wrapper<HaowutuijianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
