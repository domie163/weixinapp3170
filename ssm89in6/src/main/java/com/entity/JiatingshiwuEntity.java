package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 家庭事务
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-17 22:48:08
 */
@TableName("jiatingshiwu")
public class JiatingshiwuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiatingshiwuEntity() {
		
	}
	
	public JiatingshiwuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 事务名称
	 */
					
	private String shiwumingcheng;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 事务类型
	 */
					
	private String shiwuleixing;
	
	/**
	 * 事务详情
	 */
					
	private String shiwuxiangqing;
	
	/**
	 * 发布时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date fabushijian;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 事务进度
	 */
					
	private String shiwujindu;
	
	/**
	 * 完成时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date wanchengshijian;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：事务名称
	 */
	public void setShiwumingcheng(String shiwumingcheng) {
		this.shiwumingcheng = shiwumingcheng;
	}
	/**
	 * 获取：事务名称
	 */
	public String getShiwumingcheng() {
		return shiwumingcheng;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：事务类型
	 */
	public void setShiwuleixing(String shiwuleixing) {
		this.shiwuleixing = shiwuleixing;
	}
	/**
	 * 获取：事务类型
	 */
	public String getShiwuleixing() {
		return shiwuleixing;
	}
	/**
	 * 设置：事务详情
	 */
	public void setShiwuxiangqing(String shiwuxiangqing) {
		this.shiwuxiangqing = shiwuxiangqing;
	}
	/**
	 * 获取：事务详情
	 */
	public String getShiwuxiangqing() {
		return shiwuxiangqing;
	}
	/**
	 * 设置：发布时间
	 */
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：事务进度
	 */
	public void setShiwujindu(String shiwujindu) {
		this.shiwujindu = shiwujindu;
	}
	/**
	 * 获取：事务进度
	 */
	public String getShiwujindu() {
		return shiwujindu;
	}
	/**
	 * 设置：完成时间
	 */
	public void setWanchengshijian(Date wanchengshijian) {
		this.wanchengshijian = wanchengshijian;
	}
	/**
	 * 获取：完成时间
	 */
	public Date getWanchengshijian() {
		return wanchengshijian;
	}

}
