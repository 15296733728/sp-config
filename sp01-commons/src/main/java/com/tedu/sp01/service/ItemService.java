package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;

/**
 * 写业务定接口只为：
 * 				解耦，接口的实现可以是本地实现，也可以是Dubbo远程实现
 * @author Administrator
 *
 */
public interface ItemService {
	
	 // 订单中包含的商品列表
	List<Item>getItems(String orderId);
	
	//在保存订单时，减少商品库存
	void decreaseNumbers(List<Item> list);
}
