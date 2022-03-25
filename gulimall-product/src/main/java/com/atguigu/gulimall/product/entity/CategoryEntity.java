package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Data;

/**
 * ??Ʒ???????
 * 
 * @author ljg
 * @email 2049464827@qq.com
 * @date 2022-03-07 19:07:14
 */
@Data
@TableName("pms_category")
public class CategoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ????id
	 */
	@TableId
	private Long catId;
	/**
	 * ???????
	 */
	private String name;
	/**
	 * ??????id
	 */
	private Long parentCid;
	/**
	 * ?㼶
	 */
	private Integer catLevel;
	/**
	 * ?Ƿ???ʾ[0-????ʾ??1??ʾ]
	 */
	private Integer showStatus;
	/**
	 * ???
	 */
	private Integer sort;
	/**
	 * ͼ????ַ
	 */
	private String icon;
	/**
	 * ??????λ
	 */
	private String productUnit;
	/**
	 * ??Ʒ????
	 */
	private Integer productCount;

	@TableField(exist=false)
	private List<CategoryEntity> children;


}
