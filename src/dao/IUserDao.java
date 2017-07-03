package dao;

import java.util.List;
import domain.User;

/**
 * @author ����
 * @date 2015��10��11�� ����2:46
 * @description	�û���Ϣ�־ò�ӿڶ��壬�����û����ӣ����棬��ѯ
 * @modify BUPT-TC
 * @modifyDate 
 */

public interface IUserDao {
	public User findUser(User user);
	public User findUserById(String id);
	public boolean insertUser(User user);
	public List<User> searchUser(List<Object> choose);
	public boolean deleteUser(User user);
	public boolean addUser(User user);
	public boolean updateUser(User user);
	public List findPage(String hql,List param , Integer page,Integer rows);	
	public Long countUser(String hql, List param);
	public List<User> findAllUser();
}
