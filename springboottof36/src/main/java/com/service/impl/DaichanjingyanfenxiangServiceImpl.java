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


import com.dao.DaichanjingyanfenxiangDao;
import com.entity.DaichanjingyanfenxiangEntity;
import com.service.DaichanjingyanfenxiangService;
import com.entity.vo.DaichanjingyanfenxiangVO;
import com.entity.view.DaichanjingyanfenxiangView;

@Service("daichanjingyanfenxiangService")
public class DaichanjingyanfenxiangServiceImpl extends ServiceImpl<DaichanjingyanfenxiangDao, DaichanjingyanfenxiangEntity> implements DaichanjingyanfenxiangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DaichanjingyanfenxiangEntity> page = this.selectPage(
                new Query<DaichanjingyanfenxiangEntity>(params).getPage(),
                new EntityWrapper<DaichanjingyanfenxiangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DaichanjingyanfenxiangEntity> wrapper) {
		  Page<DaichanjingyanfenxiangView> page =new Query<DaichanjingyanfenxiangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DaichanjingyanfenxiangVO> selectListVO(Wrapper<DaichanjingyanfenxiangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DaichanjingyanfenxiangVO selectVO(Wrapper<DaichanjingyanfenxiangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DaichanjingyanfenxiangView> selectListView(Wrapper<DaichanjingyanfenxiangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DaichanjingyanfenxiangView selectView(Wrapper<DaichanjingyanfenxiangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
