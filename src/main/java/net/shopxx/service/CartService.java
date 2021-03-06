/*
 * Copyright 2005-2015 jshop.com. All rights reserved.
 * File Head

 */
package net.shopxx.service;

import net.shopxx.entity.Cart;
import net.shopxx.entity.Member;
import net.shopxx.entity.Product;

/**
 * Service - 购物车
 * 
 * @author JSHOP Team
 \* @version 3.X
 */
public interface CartService extends BaseService<Cart, Long> {

	/**
	 * 获取当前购物车
	 * 
	 * @return 当前购物车，若不存在则返回null
	 */
	Cart getCurrent();

	/**
	 * 添加商品至当前购物车
	 * 
	 * @param product
	 *            商品
	 * @param quantity
	 *            数量
	 * @return 当前购物车
	 */
	Cart add(Product product, int quantity);

	/**
	 * 合并临时购物车至会员
	 * 
	 * @param member
	 *            会员
	 * @param cart
	 *            临时购物车
	 */
	void merge(Member member, Cart cart);

	/**
	 * 清除过期购物车
	 */
	void evictExpired();

}