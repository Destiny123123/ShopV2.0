package service;

import java.util.List;
import java.util.Map;

import domain.User;

/**
 * @author ����
 * @date 2017��7��3��16:23:44
 * @description �û���ع��ܽӿڶ��壬������ɾ�Ĳ�
 * @modify BUPT
 *
 */

public interface IUserService {
	public User findUser(String userName, String password);

	public List<User> findAllUser();
}
