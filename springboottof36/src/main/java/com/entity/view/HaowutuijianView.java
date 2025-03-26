package com.entity.view;

import com.entity.HaowutuijianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 好物推荐
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-18 20:52:08
 */
@TableName("haowutuijian")
public class HaowutuijianView  extends HaowutuijianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HaowutuijianView(){
	}
 
 	public HaowutuijianView(HaowutuijianEntity haowutuijianEntity){
 	try {
			BeanUtils.copyProperties(this, haowutuijianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
