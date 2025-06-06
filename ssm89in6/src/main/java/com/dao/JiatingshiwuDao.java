package com.dao;

import com.entity.JiatingshiwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiatingshiwuVO;
import com.entity.view.JiatingshiwuView;


/**
 * 家庭事务
 * 
 * @author 
 * @email 
 * @date 2021-04-17 22:48:08
 */
public interface JiatingshiwuDao extends BaseMapper<JiatingshiwuEntity> {
	
	List<JiatingshiwuVO> selectListVO(@Param("ew") Wrapper<JiatingshiwuEntity> wrapper);
	
	JiatingshiwuVO selectVO(@Param("ew") Wrapper<JiatingshiwuEntity> wrapper);
	
	List<JiatingshiwuView> selectListView(@Param("ew") Wrapper<JiatingshiwuEntity> wrapper);

	List<JiatingshiwuView> selectListView(Pagination page,@Param("ew") Wrapper<JiatingshiwuEntity> wrapper);
	
	JiatingshiwuView selectView(@Param("ew") Wrapper<JiatingshiwuEntity> wrapper);
	
}
