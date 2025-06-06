package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiatingchengyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiatingchengyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiatingchengyuanView;


/**
 * 家庭成员
 *
 * @author 
 * @email 
 * @date 2021-04-17 22:48:08
 */
public interface JiatingchengyuanService extends IService<JiatingchengyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiatingchengyuanVO> selectListVO(Wrapper<JiatingchengyuanEntity> wrapper);
   	
   	JiatingchengyuanVO selectVO(@Param("ew") Wrapper<JiatingchengyuanEntity> wrapper);
   	
   	List<JiatingchengyuanView> selectListView(Wrapper<JiatingchengyuanEntity> wrapper);
   	
   	JiatingchengyuanView selectView(@Param("ew") Wrapper<JiatingchengyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiatingchengyuanEntity> wrapper);
   	
}

