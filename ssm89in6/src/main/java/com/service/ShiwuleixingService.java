package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShiwuleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShiwuleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShiwuleixingView;


/**
 * 事务类型
 *
 * @author 
 * @email 
 * @date 2021-04-17 22:48:08
 */
public interface ShiwuleixingService extends IService<ShiwuleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShiwuleixingVO> selectListVO(Wrapper<ShiwuleixingEntity> wrapper);
   	
   	ShiwuleixingVO selectVO(@Param("ew") Wrapper<ShiwuleixingEntity> wrapper);
   	
   	List<ShiwuleixingView> selectListView(Wrapper<ShiwuleixingEntity> wrapper);
   	
   	ShiwuleixingView selectView(@Param("ew") Wrapper<ShiwuleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShiwuleixingEntity> wrapper);
   	
}

