package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;

/**
 * дҵ�񶨽ӿ�ֻΪ��
 * 				����ӿڵ�ʵ�ֿ����Ǳ���ʵ�֣�Ҳ������DubboԶ��ʵ��
 * @author Administrator
 *
 */
public interface ItemService {
	
	 // �����а�������Ʒ�б�
	List<Item>getItems(String orderId);
	
	//�ڱ��涩��ʱ��������Ʒ���
	void decreaseNumbers(List<Item> list);
}
