package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiatingshiwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiatingshiwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiatingshiwuView;


/**
 * 家庭事务
 *
 * @author 
 * @email 
 * @date 2021-04-17 22:48:08
 */
public interface JiatingshiwuService extends IService<JiatingshiwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiatingshiwuVO> selectListVO(Wrapper<JiatingshiwuEntity> wrapper);
   	
   	JiatingshiwuVO selectVO(@Param("ew") Wrapper<JiatingshiwuEntity> wrapper);
   	
   	List<JiatingshiwuView> selectListView(Wrapper<JiatingshiwuEntity> wrapper);
   	
   	JiatingshiwuView selectView(@Param("ew") Wrapper<JiatingshiwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiatingshiwuEntity> wrapper);
   	
}

