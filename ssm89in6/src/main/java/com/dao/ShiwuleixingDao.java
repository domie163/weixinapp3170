package com.dao;

import com.entity.ShiwuleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShiwuleixingVO;
import com.entity.view.ShiwuleixingView;


/**
 * 事务类型
 * 
 * @author 
 * @email 
 * @date 2021-04-17 22:48:08
 */
public interface ShiwuleixingDao extends BaseMapper<ShiwuleixingEntity> {
	
	List<ShiwuleixingVO> selectListVO(@Param("ew") Wrapper<ShiwuleixingEntity> wrapper);
	
	ShiwuleixingVO selectVO(@Param("ew") Wrapper<ShiwuleixingEntity> wrapper);
	
	List<ShiwuleixingView> selectListView(@Param("ew") Wrapper<ShiwuleixingEntity> wrapper);

	List<ShiwuleixingView> selectListView(Pagination page,@Param("ew") Wrapper<ShiwuleixingEntity> wrapper);
	
	ShiwuleixingView selectView(@Param("ew") Wrapper<ShiwuleixingEntity> wrapper);
	
}
