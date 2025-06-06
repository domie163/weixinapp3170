package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JiatingchengyuanDao;
import com.entity.JiatingchengyuanEntity;
import com.service.JiatingchengyuanService;
import com.entity.vo.JiatingchengyuanVO;
import com.entity.view.JiatingchengyuanView;

@Service("jiatingchengyuanService")
public class JiatingchengyuanServiceImpl extends ServiceImpl<JiatingchengyuanDao, JiatingchengyuanEntity> implements JiatingchengyuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiatingchengyuanEntity> page = this.selectPage(
                new Query<JiatingchengyuanEntity>(params).getPage(),
                new EntityWrapper<JiatingchengyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiatingchengyuanEntity> wrapper) {
		  Page<JiatingchengyuanView> page =new Query<JiatingchengyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiatingchengyuanVO> selectListVO(Wrapper<JiatingchengyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiatingchengyuanVO selectVO(Wrapper<JiatingchengyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiatingchengyuanView> selectListView(Wrapper<JiatingchengyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiatingchengyuanView selectView(Wrapper<JiatingchengyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
