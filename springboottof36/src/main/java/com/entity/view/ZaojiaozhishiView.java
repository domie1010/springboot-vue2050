package com.entity.view;

import com.entity.ZaojiaozhishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 早教知识
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-18 20:52:08
 */
@TableName("zaojiaozhishi")
public class ZaojiaozhishiView  extends ZaojiaozhishiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZaojiaozhishiView(){
	}
 
 	public ZaojiaozhishiView(ZaojiaozhishiEntity zaojiaozhishiEntity){
 	try {
			BeanUtils.copyProperties(this, zaojiaozhishiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
