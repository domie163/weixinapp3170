package com.dao;

import com.entity.JiatingchengyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiatingchengyuanVO;
import com.entity.view.JiatingchengyuanView;


/**
 * 家庭成员
 * 
 * @author 
 * @email 
 * @date 2021-04-17 22:48:08
 */
public interface JiatingchengyuanDao extends BaseMapper<JiatingchengyuanEntity> {
	
	List<JiatingchengyuanVO> selectListVO(@Param("ew") Wrapper<JiatingchengyuanEntity> wrapper);
	
	JiatingchengyuanVO selectVO(@Param("ew") Wrapper<JiatingchengyuanEntity> wrapper);
	
	List<JiatingchengyuanView> selectListView(@Param("ew") Wrapper<JiatingchengyuanEntity> wrapper);

	List<JiatingchengyuanView> selectListView(Pagination page,@Param("ew") Wrapper<JiatingchengyuanEntity> wrapper);
	
	JiatingchengyuanView selectView(@Param("ew") Wrapper<JiatingchengyuanEntity> wrapper);
	
}
