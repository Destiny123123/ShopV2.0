package dao;

import domain.Commodity;

/**
 * @author ������
 * @date 2017��7��4�� ����2:46
 * @description	��Ʒ��Ϣ�־ò�ӿڶ��壬������Ʒ��ѯ
 * @modify BUPT-TC
 * @modifyDate 
 */

public interface IShowitemDao {
	public Commodity findCommodityById(String id);
}
