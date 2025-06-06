package com.entity.view;

import com.entity.JiatingshiwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 家庭事务
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-17 22:48:08
 */
@TableName("jiatingshiwu")
public class JiatingshiwuView  extends JiatingshiwuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiatingshiwuView(){
	}
 
 	public JiatingshiwuView(JiatingshiwuEntity jiatingshiwuEntity){
 	try {
			BeanUtils.copyProperties(this, jiatingshiwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
