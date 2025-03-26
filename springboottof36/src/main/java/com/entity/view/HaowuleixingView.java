package com.entity.view;

import com.entity.HaowuleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 好物类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-18 20:52:08
 */
@TableName("haowuleixing")
public class HaowuleixingView  extends HaowuleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HaowuleixingView(){
	}
 
 	public HaowuleixingView(HaowuleixingEntity haowuleixingEntity){
 	try {
			BeanUtils.copyProperties(this, haowuleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
