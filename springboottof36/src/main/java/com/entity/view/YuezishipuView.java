package com.entity.view;

import com.entity.YuezishipuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 月子食谱
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-18 20:52:08
 */
@TableName("yuezishipu")
public class YuezishipuView  extends YuezishipuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuezishipuView(){
	}
 
 	public YuezishipuView(YuezishipuEntity yuezishipuEntity){
 	try {
			BeanUtils.copyProperties(this, yuezishipuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
