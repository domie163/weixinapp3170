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


import com.dao.JiatingshiwuDao;
import com.entity.JiatingshiwuEntity;
import com.service.JiatingshiwuService;
import com.entity.vo.JiatingshiwuVO;
import com.entity.view.JiatingshiwuView;

@Service("jiatingshiwuService")
public class JiatingshiwuServiceImpl extends ServiceImpl<JiatingshiwuDao, JiatingshiwuEntity> implements JiatingshiwuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiatingshiwuEntity> page = this.selectPage(
                new Query<JiatingshiwuEntity>(params).getPage(),
                new EntityWrapper<JiatingshiwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiatingshiwuEntity> wrapper) {
		  Page<JiatingshiwuView> page =new Query<JiatingshiwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiatingshiwuVO> selectListVO(Wrapper<JiatingshiwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiatingshiwuVO selectVO(Wrapper<JiatingshiwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiatingshiwuView> selectListView(Wrapper<JiatingshiwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiatingshiwuView selectView(Wrapper<JiatingshiwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
