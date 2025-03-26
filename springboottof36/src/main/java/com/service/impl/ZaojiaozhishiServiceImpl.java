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


import com.dao.ZaojiaozhishiDao;
import com.entity.ZaojiaozhishiEntity;
import com.service.ZaojiaozhishiService;
import com.entity.vo.ZaojiaozhishiVO;
import com.entity.view.ZaojiaozhishiView;

@Service("zaojiaozhishiService")
public class ZaojiaozhishiServiceImpl extends ServiceImpl<ZaojiaozhishiDao, ZaojiaozhishiEntity> implements ZaojiaozhishiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZaojiaozhishiEntity> page = this.selectPage(
                new Query<ZaojiaozhishiEntity>(params).getPage(),
                new EntityWrapper<ZaojiaozhishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZaojiaozhishiEntity> wrapper) {
		  Page<ZaojiaozhishiView> page =new Query<ZaojiaozhishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZaojiaozhishiVO> selectListVO(Wrapper<ZaojiaozhishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZaojiaozhishiVO selectVO(Wrapper<ZaojiaozhishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZaojiaozhishiView> selectListView(Wrapper<ZaojiaozhishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZaojiaozhishiView selectView(Wrapper<ZaojiaozhishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
