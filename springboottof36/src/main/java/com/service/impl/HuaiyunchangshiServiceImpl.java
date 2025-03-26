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


import com.dao.HuaiyunchangshiDao;
import com.entity.HuaiyunchangshiEntity;
import com.service.HuaiyunchangshiService;
import com.entity.vo.HuaiyunchangshiVO;
import com.entity.view.HuaiyunchangshiView;

@Service("huaiyunchangshiService")
public class HuaiyunchangshiServiceImpl extends ServiceImpl<HuaiyunchangshiDao, HuaiyunchangshiEntity> implements HuaiyunchangshiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuaiyunchangshiEntity> page = this.selectPage(
                new Query<HuaiyunchangshiEntity>(params).getPage(),
                new EntityWrapper<HuaiyunchangshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuaiyunchangshiEntity> wrapper) {
		  Page<HuaiyunchangshiView> page =new Query<HuaiyunchangshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuaiyunchangshiVO> selectListVO(Wrapper<HuaiyunchangshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuaiyunchangshiVO selectVO(Wrapper<HuaiyunchangshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuaiyunchangshiView> selectListView(Wrapper<HuaiyunchangshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuaiyunchangshiView selectView(Wrapper<HuaiyunchangshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
